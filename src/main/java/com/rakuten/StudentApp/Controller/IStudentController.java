package com.rakuten.StudentApp.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rakuten.StudentApp.Model.Student;


@RequestMapping("/default")
public interface IStudentController {
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student);
	
	
	@GetMapping("/search/{id}")
	public Student getbyId(@PathVariable Long id);
	
	@PutMapping("/update/{id}")
	public Student studentUpdate(@PathVariable("id") Long id,@RequestBody Student student);
	
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable("id") Long id);
	
	@GetMapping("/findAll")
	public List<Student> findAll();
	

}
