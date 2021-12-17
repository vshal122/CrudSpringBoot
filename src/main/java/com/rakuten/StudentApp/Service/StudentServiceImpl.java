package com.rakuten.StudentApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.StudentApp.DAO.StudentRepository;
import com.rakuten.StudentApp.Model.Student;
@Service
public class StudentServiceImpl implements IStudentService {

	
	 @Autowired
	 private StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student update(Long id,Student student) {
		student.setId(id);
		return studentRepository.save(student);
		
	}

	@Override
	public Student findbyId(Long id) {
		
		return studentRepository.getById(id);
		
	}
	

	@Override
	public void deleteWithId(Long id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public List<Student> allStudentview() {
		
		return studentRepository.findAll();
	}

	

}
