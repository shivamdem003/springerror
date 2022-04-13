package com.example.demo.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.Entity.Student;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Long>{
	
}
