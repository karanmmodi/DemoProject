package com.Maven.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Maven.Beans.StudentBean;
import com.Maven.Dao.DaoInterface;

@Controller
public class FirstController {
	
	@Autowired(required = true)
	private DaoInterface daoimplement;
	
	@RequestMapping("/")
	public String firstPageCall() {
		return "first";
	}
	
	@RequestMapping("/insertStudent")
	public String insertStudent(StudentBean student) {
		daoimplement.insertMethod(student);
		
		return "redirect:fitst";
	}
}
