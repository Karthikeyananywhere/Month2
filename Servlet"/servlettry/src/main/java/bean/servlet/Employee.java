package bean.servlet;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	
	private String mailId;
	

	private String password;
	

	private Long phoneNumber;
	
	private LocalDate doj;
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}
	
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	
	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = LocalDate.parse(doj);
	}
	
	
	
	

}
