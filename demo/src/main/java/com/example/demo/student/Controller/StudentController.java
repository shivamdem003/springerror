package com.example.demo.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Entity.Student;
import com.example.demo.student.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student){
		System.out.println("save student");
		return studentService.saveStudent(student);
	}
	@GetMapping("/get")
	public String show(){
		System.out.println("hello");
		return "helloworld";
	}
	

}
