package Hospital_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class patient_Service {
	
	@Autowired
	public patient_Repository repo;
	
	
//for adding new patient 
	
	public ResponseEntity<Patient> addNewPateint(Patient p) {
		try {
			repo.save(p);
			return ResponseEntity.status(HttpStatus.CREATED).build();
			
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
	}
	
	
//for getting the details of all the patients	
	
	public ResponseEntity<List<Patient>> getAllPatient(){
		List<Patient> list = (List<Patient>)repo.findAll();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
		
		
	}
	
//for getting the list of all the currently admitted patients	
	
	 public ResponseEntity<List<Patient>> getAllAdmitted(){
		 List<Patient> l = (List<Patient>) repo.findAll();
		 List<Patient> finalList = new ArrayList<>();
		 for(Patient x : l) {
			 if(x.getStatus().equalsIgnoreCase("Admitted") ){
				 finalList.add(x);
				
			 }}
		 if(finalList.size()<=0) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 return ResponseEntity.of(Optional.of(finalList));
		
		 
		 }
	 

//for getting the list of all the discharged patients
	 
	 public ResponseEntity<List<Patient>> getAllDishcharged(){
		 List<Patient> l = (List<Patient>) repo.findAll();
		 List<Patient> finalList = new ArrayList<>();
		 for(Patient x : l) {
			 if(x.getStatus().equalsIgnoreCase("discharged")){
				 finalList.add(x);
				 
			 }}
		 if(finalList.size()<=0) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 return ResponseEntity.of(Optional.of(finalList));
		 
		 
		 }
	 

//controller for getting the details of specific patient by name
	 
	 public ResponseEntity<Patient> getPatientByName(String name) {
		 for(Patient p:repo.findAll()) {
			 if(p.getName().equalsIgnoreCase(name)) {
				 return ResponseEntity.of(Optional.of(p));
				 }
			 }
		 
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	 }
	
	 
		 
// for updating the status of the patient to discharged		 
	 public ResponseEntity<String> updatestatus( String name) {
		 for(Patient l : repo.findAll()) {
			 if(l.getName().equals(name)) {
				 
				 if(l.getStatus().equalsIgnoreCase("discharged")) {
					 return new ResponseEntity<String>("Patient status already discharged", HttpStatus.OK);
				 }else {
				 l.setStatus("discharged");
				 repo.save(l);
				 return new ResponseEntity<String>("Patient status updated", HttpStatus.OK);
				 }
			 }
	 }
		 return  new ResponseEntity<String>("Patient record not found", HttpStatus.NOT_FOUND);
	 }
	 
	 
// for deleting any patient record permanently
	 
	 public ResponseEntity<String> deletepatientrecord(String name) {
		 for(Patient l : repo.findAll()) {
			 if(l.getName().equals(name)) {
				 repo.delete(l);
				 return new ResponseEntity<String>("Patient deleted Successfully", HttpStatus.OK);
			 }
		 }
		 return  new ResponseEntity<String>("Patient record not found", HttpStatus.NOT_FOUND);
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
