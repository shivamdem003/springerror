package com.example.demo.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.student.Entity.Student;
import com.example.demo.student.Repository.Repository;

@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	private Repository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student);
		return studentRepo.save(student);
	}

}
