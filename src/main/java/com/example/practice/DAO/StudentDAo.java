package com.example.practice.DAO;

import java.util.List;

import com.example.practice.Model.Student;

public interface StudentDAo {
	
	List<Student> getAll();
	
	Student get(Long id);
	
	void save(Student obj);
	
	void delete(Long id);
	

}
