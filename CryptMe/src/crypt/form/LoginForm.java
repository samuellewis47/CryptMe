package crypt.form;

import javax.validation.constraints.NotBlank;

public class LoginForm {
	
	@NotBlank(message="User Name cannot be blank")
	private String userName;
	
	@NotBlank(message="Password cannot be blank")
	private String plainPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}
	
}
