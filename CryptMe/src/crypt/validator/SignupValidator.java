package crypt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import crypt.form.SignupForm;

public class SignupValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return SignupForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		SignupForm signupForm = (SignupForm) target;
		
		if(!(signupForm.getPlainPassword().equals(signupForm.getConfirmPassword()))){
			errors.rejectValue("plainPassword", "notmatch.password");
		}
	}

}
