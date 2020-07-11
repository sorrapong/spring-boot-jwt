package th.ac.bsru.webservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.ac.bsru.webservice.entities.Students;
import th.ac.bsru.webservice.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Students> getAll(){
		return studentRepository.findAll();		
	}
}
