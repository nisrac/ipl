package com.stud;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stud.model.student;
import com.stud.repositary.ssrepo;

@SpringBootTest
class StudApplicationTests {

	
	@Autowired
	 ssrepo ssrepoo;
	@Test
	public void testCreate()
	{
		student u=new student();
		u.setId(102);
		u.setName("Kavya");
		
		ssrepoo.save(u);
		//assertNotNull(userRepo.findById(902).get());
	}

	@Test
	public void testReadAll()
	{
		List<student> list=(List<student>) ssrepoo.findAll();
		//assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testUpdate()
	{
		student u=ssrepoo.findById(102).get();
		u.setName("Murthy");
		ssrepoo.save(u);
		//assertNotEquals("Niranjan",userRepo.findById(902L).get().getFirstname());
	}
	@Test
	public void testDelete()
	{		
		ssrepoo.deleteById(3);
		//assertThat(userRepo.existsById(852L)).isFalse();
	}
}





