package web2017.team3.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import web2017.team3.domain.ZWTFileBean;
import web2017.team3.service.ZWTFileService;

@Controller
public class ZWTFileController {

	@Autowired
	private ZWTFileService fileService = new ZWTFileService();

	@RequestMapping("ZWTupLoadForTeacher.html")
	public ModelAndView ZWTupLoad(HttpServletRequest request) {
		
		return new ModelAndView("ZWTupLoadForTeacher");
	}

	@RequestMapping("ZWTfileupload.html")
	public ModelAndView ZWTfileupload(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("jinliale");
		request.setCharacterEncoding("UTF-8");
		// 获取 ServletFileUpload 对象.
		ServletFileUpload upload = fileService.getServletFileUpload();
		try {
			List<FileItem> items = upload.parseRequest(request);
			fileService.upload(items);
			return ZWTshowListForTeacher(map, request);

		} catch (FileUploadException e) {
			e.printStackTrace();
			request.setAttribute("message", e.getMessage());
			return new ModelAndView("ZWTFail");
		}

	}

	@RequestMapping("ZWTdownload.html")
	public void ZWTdownload(HttpServletRequest request, HttpServletResponse response, ZWTFileCommond filecommond)
			throws IOException {

		int fileid = filecommond.getFileid();
		ZWTFileBean file = fileService.findFileByFileid(fileid);
		System.out.println(file);

		// 获得请求文件名
		String fileName = file.getFileName();
		// 设置后缀
		Path path = Paths.get(fileName);
		String type = Files.probeContentType(path);
		response.setContentType(type);
		// 文件名转码
		fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");
		// 设置Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName);

		// 读取目标文件，通过response将目标文件写到客户端
		// 获取目标文件的绝对路径
		String downloadFilePath = file.getFilePath();
		// 读取文件
		InputStream in = new FileInputStream(downloadFilePath);
		OutputStream out = response.getOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}

	@RequestMapping("ZWTdeletefileByID.html")
	public ModelAndView ZWTdeletefileByID(Map<String, Object> map, HttpServletRequest request,
			ZWTFileCommond filecommond) throws UnsupportedEncodingException {
		int fileid = filecommond.getFileid();
		fileService.deletefileByID(fileid);
		return ZWTshowListForTeacher(map, request);
	}

	@RequestMapping("ZWTshowListForTeacher.html")
	public ModelAndView ZWTshowListForTeacher(Map<String, Object> map, HttpServletRequest request)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String select = request.getParameter("select");
		String input = request.getParameter("input");

		List<ZWTFileBean> fileList = fileService.queryTypeChoose(select, input);

		map.put("fileList", fileList);

		return new ModelAndView("ZWTshowListForTeacher");
	}

	

	@RequestMapping("ZWTshowListForStudent.html")
	public ModelAndView ZWTshowListForStudent(Map<String, Object> map, HttpServletRequest request)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String select = request.getParameter("select");
		String input = request.getParameter("input");

		List<ZWTFileBean> fileList = fileService.queryTypeChoose(select, input);

		map.put("fileList", fileList);

		return new ModelAndView("ZWTshowListForStudent");
	}
	
	@RequestMapping("ZWTshowListForAdmin.html")
	public ModelAndView ZWTshowListForAdmin(Map<String, Object> map, HttpServletRequest request)
			throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		String select = request.getParameter("select");
		String input = request.getParameter("input");

		List<ZWTFileBean> fileList= fileService.queryTypeChoose(select, input);

		map.put("fileList", fileList);

		return new ModelAndView("ZWTshowListForAdmin");
	}


}
