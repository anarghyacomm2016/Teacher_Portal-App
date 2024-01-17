package TeacherPortalDB.TeacherPortal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String PhoneNumber;
    private String message;
	public Long getId() {
		return id;
	} 
	public DataEntity() {
		
		
		
	}
	public DataEntity(Long id, String name, String email, String phoneNumber, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		PhoneNumber = phoneNumber;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "DataEntity [id=" + id + ", name=" + name + ", email=" + email + ", PhoneNumber=" + PhoneNumber
				+ ", message=" + message + "]";
	}
	
	
}
	
	
	
	
	