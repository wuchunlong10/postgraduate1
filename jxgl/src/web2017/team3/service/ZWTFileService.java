package web2017.team3.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import web2017.team3.dao.ZWTFileDao;
import web2017.team3.domain.ZWTFileBean;
import web2017.team3.exception.InvalidExtNameException;
import web2017.team3.utils.ZWTFileUploadAppProperties;
import web2017.team3.utils.ZWTFileUtils;

@Service
public class ZWTFileService {
	private static final String FILE_PATH = "/Volumes/750G/工作/STS项目/FileUpandLoad/WebContent/WEB-INF/files/";
	
	private static final String TEMP_DIR = "/Volumes/750G/工作/STS项目/FileUpandLoad/WebContent/WEB-INF/tempDirectory/";

	@Autowired
	private ZWTFileDao fileDao = new ZWTFileDao();

	/**
	 * 构建 ServletFileUpload 对象 从配置文件中读取了部分属性, 用户设置约束. 该方法代码来源于文档.
	 * 
	 * @return
	 */
	public ServletFileUpload getServletFileUpload() {
		String fileMaxSize = ZWTFileUploadAppProperties.getInstance().getProperty("file.max.size");
		String totalFileMaxSize = ZWTFileUploadAppProperties.getInstance().getProperty("total.file.max.size");

		DiskFileItemFactory factory = new DiskFileItemFactory();

		factory.setSizeThreshold(1024 * 500);
		File tempDirectory = new File(TEMP_DIR);
		factory.setRepository(tempDirectory);

		ServletFileUpload upload = new ServletFileUpload(factory);

		upload.setSizeMax(Integer.parseInt(totalFileMaxSize));
		upload.setFileSizeMax(Integer.parseInt(fileMaxSize));

		return upload;
	}

	public void upload(List<FileItem> items) throws IOException {
		// 把需要上传的 FileItem 都放入到该 Map 中
		// 键: 文件的待存放的路径, 值: 对应的 FileItem 对象
		Map<String, FileItem> uploadFiles = new HashMap<String, FileItem>();

		// 解析请求, 得到 FileItem 的集合.

		// 1. 构建 FileUploadBean 的集合, 同时填充 uploadFiles
		List<ZWTFileBean> beans;
		try {
			beans = buildFileUploadBeans(items, uploadFiles);
			// 2. 校验扩展名:
			vaidateExtName(beans);

			// 3. 校验文件的大小: 在解析时, 已经校验了, 我们只需要通过异常得到结果.

			// 4. 进行文件的上传前的准备工作及后续上传操作.
			uploadbefore(uploadFiles);

			// 5. 把上传的信息保存到数据库中
			saveBeans(beans);

			// 6. 删除临时文件夹的临时文件
			ZWTFileUtils.delAllFile(TEMP_DIR);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void saveBeans(List<ZWTFileBean> beans) {
		fileDao.save(beans);
	}

	/**
	 * 文件上传前的准备工作. 得到 filePath 和 InputStream
	 * 
	 * @param uploadFiles
	 * @throws IOException
	 */
	private void uploadbefore(Map<String, FileItem> uploadFiles) throws IOException {
		for (Map.Entry<String, FileItem> uploadFile : uploadFiles.entrySet()) {
			String filePath = uploadFile.getKey();
			FileItem item = uploadFile.getValue();

			upload(filePath, item.getInputStream());
		}
	}

	/**
	 * 文件上传的 IO 方法.
	 * 
	 * @param filePath
	 * @param inputStream
	 * @throws IOException
	 */
	private void upload(String filePath, InputStream inputStream) throws IOException {
		OutputStream out = new FileOutputStream(filePath);

		byte[] buffer = new byte[1024];
		int len = 0;

		while ((len = inputStream.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}

		inputStream.close();
		out.close();

		System.out.println(filePath);
	}

	/**
	 * 校验扩展名是否合法
	 * 
	 * @param beans:
	 */
	private void vaidateExtName(List<ZWTFileBean> beans) {
		String exts = ZWTFileUploadAppProperties.getInstance().getProperty("exts");
		List<String> extList = Arrays.asList(exts.split(","));
		System.out.println(extList);

		for (ZWTFileBean bean : beans) {
			String fileName = bean.getFileName();
			System.out.println(fileName.indexOf("."));

			String extName = fileName.substring(fileName.lastIndexOf(".") + 1);
			System.out.println(extName);

			if (!extList.contains(extName)) {
				throw new InvalidExtNameException(fileName + "文件的扩展名不合法");
			}
		}
	}

	/**
	 * 利用传入的 FileItem 的集合, 构建 FileUploadBean 的集合, 同时填充 uploadFiles
	 * 
	 * FileUploadBean 对象封装了: id, fileName, filePath, fileDesc uploadFiles:
	 * Map<String, FileItem> 类型, 存放文件域类型的 FileItem. 键: 待保存的文件的名字 ,值: FileItem 对象
	 * 
	 * 构建过程: 1. 对传入 FileItem 的集合进行遍历. 得到 desc 的那个 Map. 键: desc 的
	 * fieldName(desc1, desc2 ...). 值: desc 的那个输入的文本值
	 * 
	 * 2. 对传入 FileItem 的集合进行遍历. 得到文件域的那些 FileItem 对象, 构建对应的 key (desc1 ....)
	 * 来获取其 desc. 构建的 FileUploadBean 对象, 并填充 beans 和 uploadFiles
	 * 
	 * @param items
	 * @param uploadFiles
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private List<ZWTFileBean> buildFileUploadBeans(List<FileItem> items, Map<String, FileItem> uploadFiles)
			throws UnsupportedEncodingException {
		List<ZWTFileBean> beans = new ArrayList<>();

		Map<String, String> descs = new HashMap<>();
		// 遍历所有获取到的条目，将所有文本域中的desc存入描述集合descs。
		for (int i = 0; i < items.size(); i++) {
			FileItem item = items.get(i);
			if (item.isFormField()) {
				// desc1 或 desc2 ...
				String fieldName = item.getFieldName();
				String desc = item.getString("UTF-8");
				descs.put(fieldName, desc);
			}
		}

		for (int i = 0; i < items.size(); i++) {
			FileItem item = items.get(i);
			ZWTFileBean bean = null;
			if (!item.isFormField()) {
				String fieldName = item.getFieldName();// file1,file2等等
				String descName = "desc" + fieldName.substring(fieldName.length() - 1);// desc+1，2等等
				String desc = descs.get(descName); // 从上面的descs集合中获取当前file1所对应的文件描述desc1

				// 对应文件名
				String fileName = item.getName();// 上传文件的文件名
				String filePath = getFilePath(fileName);// 获取该文件的路径

				bean = new ZWTFileBean(fileName, filePath, desc);// 实例化一个文件类
				beans.add(bean);// 加到所有待上传上传文件的集合中

				uploadFiles.put(bean.getFilePath(), item);// 填充uploadFiles，存入路径名及对应的文件条目
			}
		}

		return beans;
	}

	/**
	 * 根据指定的文件名构建一个随机的文件名 1. 构建的文件的文件名的扩展名和给定的文件的扩展名一致 2. 利用 ServletContext 的
	 * getRealPath 方法获取的绝对路径 3. 利用了 Random 和 当前的系统时间构建随机的文件的名字
	 * 
	 * @param fileName
	 * @return
	 */
	private String getFilePath(String fileName) {
		String extName = fileName.substring(fileName.lastIndexOf("."));
		Random random = new Random();

		String filePath = FILE_PATH + System.currentTimeMillis() + random.nextInt(100000) + extName;
		return filePath;
	}

	public List<ZWTFileBean> findFileByType(String type) {
		System.out.println("1");
		return fileDao.findFileByType(type);
		// TODO Auto-generated method stub
		
	}

	public List<ZWTFileBean> findFileByrecentDate() {
		// TODO Auto-generated method stub
		return fileDao.findFileByrecentDate();
	}

	public List<ZWTFileBean> findFileByfileName(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("hhhh");
		return fileDao.findFileByfileName(fileName);
	}

	public List<ZWTFileBean> findAllfiles() {
		// TODO Auto-generated method stub
		return fileDao.getAllFiles();
	}

	public void deletefileByID(int fileid) {
		// TODO Auto-generated method stub
		fileDao.deletefileByID(fileid);
	}

	public ZWTFileBean findFileByFileid(int fileid) {
		// TODO Auto-generated method stub
		return fileDao.findFileByFileid(fileid);
	}

	public List<ZWTFileBean> queryTypeChoose(String select, String input) {
		List<ZWTFileBean> fileList;
		
		if ("1".equals(select)) {
			// 按文件名
			System.out.println(select + " " + input);
			fileList = (List<ZWTFileBean>) findFileByfileName(input);
		} else {
			if ("2".equals(select)) {
				// 按课程名查询
				System.out.println(select + " " + input);
				fileList = (List<ZWTFileBean>) findFileByType(input);
			} else {
				if ("3".equals(select)) {
					// 按三天之内查询
					System.out.println(select + " " + input);
					fileList = (List<ZWTFileBean>) findFileByrecentDate();
				} else {
					// 显示所有资源文件
					fileList = (List<ZWTFileBean>) findAllfiles();
				}
			}

		}
		return fileList;
	}
}
