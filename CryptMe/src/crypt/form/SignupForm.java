package crypt.form;

import javax.validation.constraints.NotBlank;

public class SignupForm {
	
	@NotBlank(message="User Name cannot be blank")
	private String userName;
	
	@NotBlank(message="Name cannot be blank")
	private String name;
	
	@NotBlank(message="Email cannot be blank")
	private String email;
	
	@NotBlank(message="Password cannot be blank")
	private String plainPassword;
	
	@NotBlank(message="Confirm Password cannot be blank")
	private String confirmPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
