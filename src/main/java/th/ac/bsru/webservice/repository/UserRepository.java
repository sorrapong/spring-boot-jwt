package th.ac.bsru.webservice.repository;

import org.springframework.stereotype.Repository;

import th.ac.bsru.webservice.entities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{	
	List<User> findByUsernameAndPassword(String username, String password);
	List<User> findByUsername(String username);
}
