package Hospital_api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patient_Controller {
	
	@Autowired
	public patient_Service service;
	
	
//Controller for adding new patient	
	@PostMapping("/addpatient")
	public ResponseEntity<Patient> addPatient(@RequestBody Patient p) {
		return service.addNewPateint(p);
		
		}
	
	
//Controller for getting the list of all the admitted patients	
	
	@GetMapping("/admitted")
	public ResponseEntity<List<Patient>> admittedPatients(){
		return service.getAllAdmitted();
	}
	

//Controller for getting the list of all the discharged patients	
	@GetMapping("/discharged")
	public ResponseEntity<List<Patient>> dischargedPatient(){
		return service.getAllDishcharged();
	}
	
	
//Controller for getting the list of all the patients details (admitted and discharged both)	
	
	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> display(){
		return service.getAllPatient();
	}
	
//Controller for getting the patient details by name
	
	@GetMapping("/patient/{name}")
	public ResponseEntity<Patient> getPatient(@PathVariable String name) {
		return service.getPatientByName(name);
	}
	
	
//Controller for updating the status of the patient to discharged	
	@PutMapping("/update/{name}")
	public ResponseEntity<String>  update( @PathVariable String name) {
		return service.updatestatus(name);
		
	}
	
	
//	for deleting the patient record
	@DeleteMapping(value="/delete/{name}")
	public ResponseEntity<String> deletePatient(@PathVariable String name) {
		return service.deletepatientrecord(name);
	}
	
	

}
