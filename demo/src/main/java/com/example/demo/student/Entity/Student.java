package com.example.demo.student.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String classRoom;
	private String section;
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getClassRoom() {
//		return classRoom;
//	}
//	public void setClassRoom(String classRoom) {
//		this.classRoom = classRoom;
//	}
//	public String getSection() {
//		return section;
//	}
//	public void setSection(String section) {
//		this.section = section;
//	}
//	public Student(long id, String name, String classRoom, String section) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.classRoom = classRoom;
//		this.section = section;
//	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", classRoom=" + classRoom + ", section=" + section + "]";
//	}

	
}
