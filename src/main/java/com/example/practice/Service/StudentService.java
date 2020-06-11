package com.example.practice.Service;

import java.util.List;

import com.example.practice.Model.Student;

public interface StudentService {
	List<Student> getAll();
	
	Student get(Long id);
	
	void save(Student obj);
	
	void delete(Long id);
	
}
