package com.example.practice.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.DAO.StudentDAo;
import com.example.practice.Model.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAo student;
	
	@Override
	public List<Student> getAll() {
	
		return student.getAll();
	}

	@Override
	public Student get(Long id) {
		
		return student.get(id);
	}
	
	@Transactional
	@Override
	public void save(Student obj) {
		student.save(obj);
		
	}
	@Transactional
	@Override
	public void delete(Long id) {
		student.delete(id);
		
	}

}
