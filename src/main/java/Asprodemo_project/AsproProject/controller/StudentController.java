package Asprodemo_project.AsproProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Asprodemo_project.AsproProject.entity.Student;
import Asprodemo_project.AsproProject.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	
	@Autowired
	 StudentService service;
	 @PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student request) {
    return service.saveStudent(request);
		
	}
	 @GetMapping("/getAllStudent")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	 
	
	
	
	

}
