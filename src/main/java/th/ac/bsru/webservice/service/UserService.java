package th.ac.bsru.webservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.ac.bsru.webservice.entities.User;
import th.ac.bsru.webservice.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User checkUserPass(String username, String password) {
		List<User> listuser = userRepository.findByUsernameAndPassword(username, password);
		
		User user = null;
		
		try {
			user = listuser.get(0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		return user;  		
	}
	
	public User checkUser(String username) {
		List<User> listuser = userRepository.findByUsername(username);
		
		User user = null;
		
		try {
			user = listuser.get(0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		return user;  		
	}
	
	public User save(User entity) {
        return Optional.ofNullable(userRepository.save(entity)).orElse(null);
   }
	
}
