package Hospital_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login_controller {

	
	@Autowired
	public login_service services;
	
//Controller for staff sign up
	
	@PostMapping("/signup")
	public ResponseEntity<String> signup(@RequestBody login l) {
		return services.signupmethod(l);
	}
	
	
//controller for staff login only enter username and password in body
	
	@PostMapping("/login")
	public ResponseEntity<String> loginuser( @RequestBody login l) {
		return services.loginmethod(l);
	}
}


