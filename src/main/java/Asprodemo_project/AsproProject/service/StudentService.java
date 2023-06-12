package Asprodemo_project.AsproProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Asprodemo_project.AsproProject.entity.Student;
import Asprodemo_project.AsproProject.repository.StudentRepository;

@Service
public class StudentService {
	   @Autowired
	private  StudentRepository studentRepository;
	
	public Student saveStudent(Student request) {
	return studentRepository.save(request);
		
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	

	
	}


