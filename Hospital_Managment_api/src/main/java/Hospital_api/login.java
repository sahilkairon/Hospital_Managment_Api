package Hospital_api;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity 
public class login {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String role;
	
	@Column(nullable=false)
	private String status;
	
	
	public login() {}
	
	public login(String username, String password, String name, String role, String status) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
 
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
 
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
