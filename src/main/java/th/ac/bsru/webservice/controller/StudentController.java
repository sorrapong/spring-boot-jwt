package th.ac.bsru.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.ac.bsru.webservice.entities.Students;
import th.ac.bsru.webservice.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired 
	private StudentService studentService;
	
	@RequestMapping("")
	public List<Students> getStudents() {
		
		return this.studentService.getAll();
	}

}
