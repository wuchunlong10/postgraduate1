package Control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entity.Evaluate;
import Entity.teacherDao;
import Service.queryPJ;

@Controller
public class queryPingjiao {
		@Autowired
		private queryPJ qPj;
		
		@RequestMapping(value = "/queryPingJiao.html")
		public ModelAndView queryPJ(HttpServletRequest request,Evaluate evaluate) {
			List<Evaluate> eList = qPj.queryPingJiao(evaluate.getSubjectName());
			request.getSession().setAttribute("elist", eList);
			return   new ModelAndView("queryPingjiao");
		}
		
		@RequestMapping(value = "/queryPingjiao.html")
		public ModelAndView queryList(HttpServletRequest request) {
			List<Evaluate> CList = qPj.queryCourseList("201703056");
			for(Evaluate evaluate: CList) {
				System.out.println(evaluate.getSubjectName());
				System.out.println(evaluate.getSubjectNumber());
			}
			request.getSession().setAttribute("Clist", CList);
			return   new ModelAndView("queryList");
		}
}
