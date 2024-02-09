/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Feb 8, 2024
 */
package model;

/**
 * 
 */
public class ProcessUser {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String address;
	private String city;
	private String state;
	/**
	 * 
	 */
	public ProcessUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param email
	 * @param address
	 * @param city
	 * @param state
	 */
	public ProcessUser(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param email
	 * @param address
	 * @param city
	 * @param state
	 */
	public ProcessUser(String phoneNumber, String email, String address, String city,
			String state) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String printBasicDetails() {
		return "firstName= " + firstName + ", lastName= " + lastName;
	}

	public String printAdditionalDetails() {
		return "phoneNumber=" + phoneNumber
				+ ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state;
	}
	
	

	
}
