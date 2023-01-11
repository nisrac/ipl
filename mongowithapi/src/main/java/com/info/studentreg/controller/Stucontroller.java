package com.info.studentreg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.studentreg.model.Student;
import com.info.studentreg.repositary.Sturepo;

@RestController
public class Stucontroller {
	@Autowired
	Sturepo sturepo;
	@PostMapping("addStu")
	public String addStu(@RequestBody Student stu)
	{
		sturepo.save(stu);
		return "record inserted" + stu.getId();
		
	}
	@GetMapping("/display")
	public List<Student> display()
	{
		return sturepo.findAll();
	}
	@GetMapping("/search/{id}")
	public Optional<Student> search(@PathVariable int id)
	{
		return sturepo.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String  delete(@PathVariable int id)
	{
		sturepo.deleteById(id);
		return "record deleted" + id;
	}
	@PutMapping("/update")
	public String update(@RequestBody Student stu)
	{
		Student ex=sturepo.findById(stu.getId()).get();
		ex.setName(stu.getName());
		ex.setBranch(stu.getBranch());
		 sturepo.save(ex);
		 return "recode updated"+stu.getId();
		
	}
		
	

} 
