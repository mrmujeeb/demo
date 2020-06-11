package com.example.practice.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.practice.Model.Student;

@Repository
public class StudentDAOImpl implements StudentDAo {

	@Autowired
	private EntityManager entityManager;

	
	@Override
	public List<Student> getAll() {
	Session currentSession=	entityManager.unwrap(Session.class);
	Query<Student> query=currentSession.createQuery("from Student",Student.class);
	List<Student> result=query.getResultList();
	return result;
	}

	@Override
	public Student get(Long id) {
		Session currentSession=	entityManager.unwrap(Session.class);
		Student result=currentSession.get(Student.class, id);
	return result;
	}

	@Override
	public void save(Student obj) {
		Session currentSession=	entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(obj);
		
	}

	@Override
	public void delete(Long id) {
		Session currentSession=	entityManager.unwrap(Session.class);
		Student obj=get(id);
		currentSession.delete(obj);
	}

}
