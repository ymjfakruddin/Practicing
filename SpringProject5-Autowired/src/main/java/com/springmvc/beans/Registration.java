package com.springmvc.beans;

public class Registration {
    private String username;
	private String number;
	private String email;
	private String gender;
	private String age;
	private String password;
	
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
    @Override
    public String toString() {
			return "Registration [usernamename=" + username + ", Contact number" + number +", email=" + email + ", gender=" + gender + ", age="
					+ age + ", password=" + password +  "]";
		}
		
		
		
}