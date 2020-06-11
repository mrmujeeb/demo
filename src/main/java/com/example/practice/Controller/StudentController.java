package com.example.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.DAO.StudentDAo;
import com.example.practice.Model.Student;
import com.example.practice.Service.StudentService;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
	@Autowired
	StudentService student;
	
	@GetMapping("/getAll")
	public List<Student>  getAll(){
		return student.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Student get(@PathVariable int id) {
		
		return student.get((long) id);
		
	}
	@PostMapping("/save")
	public void save(Student obj) {
		student.save(obj);
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable Long id) {
		student.delete(id);
	}

}
