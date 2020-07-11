package th.ac.bsru.webservice.repository;

import org.springframework.stereotype.Repository;

import th.ac.bsru.webservice.entities.Students;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long>{	
	
}
