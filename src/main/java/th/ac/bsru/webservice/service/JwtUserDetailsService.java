package th.ac.bsru.webservice.service;


import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import th.ac.bsru.webservice.entities.User;



@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@org.springframework.beans.factory.annotation.Autowired
	private UserService userService; 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.checkUser(username);
		
		if (user != null) {
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("not found username: " + username);
		}
	}
}

