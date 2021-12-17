package com.rakuten.StudentApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.StudentApp.Model.Student;
import com.rakuten.StudentApp.Service.StudentServiceImpl;

@RestController
public class StudentControllerImpl implements IStudentController {

	@Autowired
	public StudentServiceImpl serviceImpl;
	
	@Override
	public Student createStudent(Student student) {
		
	return 	serviceImpl.save(student);
	}

	@Override
	public Student getbyId(Long id) {
	
		return serviceImpl.findbyId(id);
	}

	@Override
	public Student studentUpdate(Long id,Student student) {
		
		return serviceImpl.update(id,student);
	}

	@Override
	public void deleteStudent(Long id) {
		serviceImpl.deleteWithId(id);
		
	}

	@Override
	public List<Student> findAll() {
		
		return serviceImpl.allStudentview();
	}
	
	
	
	
	

}
