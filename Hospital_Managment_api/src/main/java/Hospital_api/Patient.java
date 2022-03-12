package Hospital_api;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue
	private int patient_id;
	private String name;
	private String age;
	private String room;
	private String doctor_name;
	private Date admit_date;
	private int expenses;
	private String status;
	
	
	
	public Patient() {}
	
	
	public Patient(String name, String age, String room, String doctor_name, Date admit_date, int expenses,
			String status) {
		super();
		this.name = name;
		this.age = age;
		this.room = room;
		this.doctor_name = doctor_name;
		this.admit_date = admit_date;
		this.expenses = expenses;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public Date getAdmit_date() {
		return admit_date;
	}
	public void setAdmit_date(Date admit_date) {
		this.admit_date = admit_date;
	}
	public int getExpenses() {
		return expenses;
	}
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
	
	
//	@Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Patient)) return false;
//       Patient k  = (Patient) o;
//        return Objects.equals(status, k.status);
//    }
//
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, status);
//	}
//	
//	@Override
//    public String toString() {
//        return "User{" +
//                
//                ", status='" + status + '\'' +
//                ", name='" + name ; };
//    
//	
//	
//}
//

