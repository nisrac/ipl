package com.stud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stud.model.student;
import com.stud.repositary.ssrepo;

@Controller
public class Scontroller {
	@Autowired
	ssrepo Srepo;
	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}

	@RequestMapping("addStud")
	public String addStud(student Student )
	{
		Srepo.save(Student);
		return "index.jsp";
	}
	@RequestMapping("getStud")
	public ModelAndView getStud(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("display.jsp");
		student Student=Srepo.findById(id).orElse(new student());
		mv.addObject(Student);
		return mv;
	}
}

