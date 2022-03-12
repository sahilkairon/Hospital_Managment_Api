package Hospital_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class login_service {
	
	@Autowired
	public loginrepo repos;
	
	
	public ResponseEntity<String> signupmethod(login l) {
		try {
			for(login n : repos.findAll()) {
				if(n.getUsername().equals(l.getUsername())) {
					return new ResponseEntity<String>("user already exist, please choose another username", HttpStatus.BAD_REQUEST);
				}
				 
			}
			repos.save(l);
			return new ResponseEntity<String>("User Successfully Created", HttpStatus.CREATED);
		
		
			
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error while creating user, field cannot be left empty", HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	public  ResponseEntity<String> loginmethod(String username, String password) {
		try {
			for(login l:repos.findAll()) {
				if(l.getUsername().equalsIgnoreCase(username) && l.getPassword().equals(password)) {
					return  new ResponseEntity<String>("User Logged in", HttpStatus.OK);
				}
				 
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return  new ResponseEntity<String>("Username or Password is incorrect", HttpStatus.BAD_REQUEST);
		
		 
		
	}

}
