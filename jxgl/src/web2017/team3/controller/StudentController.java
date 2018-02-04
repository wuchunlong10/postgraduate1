package web2017.team3.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import web2017.team3.domain.Student;
import web2017.team3.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService StudentService;
	
	@RequestMapping(value="/lookForPassword.html")
	public ModelAndView lookForPassword(PasswordCommand passwordCommand){
		StudentService.lookForPassword(passwordCommand.getPassword(),passwordCommand.getUsername(), passwordCommand.getSex(), passwordCommand.getWord());
		System.out.println("------"+passwordCommand.getPassword()+"-------"+passwordCommand.getUsername());
		return new ModelAndView("success");
		
	}
	
	@RequestMapping(value="/registStudent.html")
	public ModelAndView registStudent(StudentRegist stu){
		stu.setPassword(stu.getPassword());
		stu.setUsername(stu.getUsername());
		stu.setSex(stu.getSex());
		stu.setWord(stu.getWord());
		if(StudentService.hasMatchCount(stu.getUsername(), stu.getPassword())){
			return new ModelAndView("regist","error","该用户已存在，请重新输入");
		}else{
			System.out.println("=============="+stu.getWord());
			System.out.println("========username======"+stu.getUsername());
			System.out.println("--------studentRegist:"+stu);
			StudentService.insertStudent(stu);
			return new ModelAndView("success");
		}
	}
	
	@RequestMapping(value = "/uploadImg.html",method = RequestMethod.POST)
    public ModelAndView photoUpload(@RequestParam("file") MultipartFile file,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IllegalStateException, IOException{
        if (file!=null) {// 判断上传的文件是否为空
            String path=null;// 文件路径
            String type=null;// 文件类型
            String fileName=file.getOriginalFilename();// 文件原名称
            System.out.println("上传的文件原名称:"+fileName);
            // 判断文件类型
            type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
            if (type!=null) {// 判断文件类型是否为空
                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"jpeg".equalsIgnoreCase(type)||"JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    String realPath=request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName=String.valueOf(System.currentTimeMillis())+"-"+fileName;
                    // 设置存放图片文件的路径
                    path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
                    System.out.println("存放图片文件的路径:"+path);
                    // 转存文件到指定的路径
                    file.transferTo(new File(path));
                    System.out.println("文件成功上传到指定目录下");
                    session.setAttribute("imgPath", path);
                    return new ModelAndView("imgUpload","succ","文件成功上传到指定目录下"+path);
                }else {
                    System.out.println("不是我们想要的文件类型,请按要求重新上传");
                    return new ModelAndView("imgUpload","fault","不是我们想要的文件类型,请按要求重新上传");
                }
            }else {
                System.out.println("对不起，您未上传内容，请重新选择");
                return new ModelAndView("imgUpload","fault","对不起，您未上传内容，请重新选择");
            }
        }else {
            System.out.println("没有找到相对应的文件");
            return new ModelAndView("imgUpload","fault","没有找到相对应的文件");
        }
    }
	
	
	//hxp
	
	@RequestMapping("/show.html")
	public ModelAndView showStudent(Model model){
		List<Student> list = StudentService.findAllStudnt();
		model.addAttribute("list", list);
		return new ModelAndView("showStudent");
	}
	
	@RequestMapping("/save.html")
	public ModelAndView saveStudent(HttpServletRequest request,Model model){
		try {
			Student student = new Student();
			student.setUsername(request.getParameter("username"));
			student.setAge(new Integer(request.getParameter("age")));
			student.setBirth(request.getParameter("birth"));
			student.setPassword("123");
			student.setClassname(request.getParameter("classname"));
			student.setCollage(request.getParameter("collage"));
			student.setIntake(request.getParameter("intake"));
			student.setMajor(request.getParameter("major"));
			student.setNation(request.getParameter("nation"));
			student.setSex(request.getParameter("sex"));
			student.setWord("123");
			StudentService.saveStudent(student);
			model.addAttribute("tip", "保存成功");
		} catch (Exception e) {
			model.addAttribute("tip", "保存失败:"+e.getStackTrace());
		}
		return new ModelAndView("index");
	}
	
	@RequestMapping("/delete.html")
	public ModelAndView deleteStudent(HttpServletRequest request,Model model){
		try {
			String userid = request.getParameter("userid");
			System.out.println("delete.html userid = "+userid);
System.out.println(new Integer(userid));
			StudentService.deleteStudent(new Integer(userid));
			model.addAttribute("tip", "删除成功");
		} catch (Exception e) {
			model.addAttribute("tip", "删除失败:"+e.getStackTrace());
		}
		return new ModelAndView("index");
	}
	
	@RequestMapping("/toUapdate.html")
	public ModelAndView toUapdateStudent(HttpServletRequest request,Model model){
		try {
			String userid = request.getParameter("userid");
			Student student = StudentService.findById(new Integer(userid));
			model.addAttribute("student", student);
		} catch (Exception e) {
			model.addAttribute("tip", e.getStackTrace());
		}
		return new ModelAndView("update");
	}
	
	
	@RequestMapping("/query.html")
	public ModelAndView queryStudent(HttpServletRequest request,Model model){
		try {
			List<Student> list = new ArrayList<Student>();
			String userid = request.getParameter("userid");
			String username = request.getParameter("username");
			if(userid.trim() != "" && userid.trim() != null) {
				Student student = StudentService.findById(new Integer(userid));
				list.add(student);
			}else{
				if(username.trim() != "" && username.trim() != null){
					list = StudentService.findStudnt(username);
				}else{
					list = StudentService.findAllStudnt();
				}
			}
			model.addAttribute("list", list);
		} catch (Exception e) {
			model.addAttribute("tip", "学号或者姓名不正确");
		}
		return new ModelAndView("showStudent");
	}
	
	@RequestMapping("/update.html")
	public ModelAndView uapdateStudent(HttpServletRequest request,Model model){
//		try {
			Student student = new Student();
			student.setUserid(new Integer(request.getParameter("userid")));
			student.setUsername(request.getParameter("username"));
			student.setAge(new Integer(request.getParameter("age")));
			student.setBirth(request.getParameter("birth"));
			student.setClassname(request.getParameter("classname"));
			student.setCollage(request.getParameter("collage"));
			student.setIntake(request.getParameter("intake"));
			student.setMajor(request.getParameter("major"));
			student.setNation(request.getParameter("nation"));
			student.setSex(request.getParameter("sex"));
			student.setWord("1");
			StudentService.updateStudent(student);
			model.addAttribute("tip", "修改成功");
//		} catch (Exception e) {
//			model.addAttribute("tip", "修改失败:"+e.getStackTrace());
//		}
		return new ModelAndView("index");
	}
	
}	
	
	
	
/*	@RequestMapping(value = "/uploadImg.html",method = RequestMethod.POST)
	public ResultData<Object> photoUpload(@RequestParam("file") MultipartFile file,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IllegalStateException, IOException{
		ResultData<Object> resultData = new ResultData<Object>();
		
		if (file!=null) {// 判断上传的文件是否为空
			String path=null;// 文件路径
			String type=null;// 文件类型
			String fileName=file.getOriginalFilename();// 文件原名称
			System.out.println("上传的文件原名称:"+fileName);
			// 判断文件类型
			type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
			if (type!=null) {// 判断文件类型是否为空
				if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"jpeg".equalsIgnoreCase(type)||"JPG".equals(type.toUpperCase())) {
					// 项目在容器中实际发布运行的根路径
					String realPath=request.getSession().getServletContext().getRealPath("/");
					// 自定义的文件名称
					String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
					// 设置存放图片文件的路径
					path=realPath+System.getProperty("file.separator")+trueFileName;
					System.out.println("存放图片文件的路径:"+path);
					// 转存文件到指定的路径
					file.transferTo(new File(path));
					System.out.println("文件成功上传到指定目录下");
					
				}else {
					System.out.println("不是我们想要的文件类型,请按要求重新上传");
					return null;
				}
			}else {
				System.out.println("文件类型为空");
				return null;
			}
		}else {
			System.out.println("没有找到相对应的文件");
			return null;
		}
		return resultData;
	}
*/

