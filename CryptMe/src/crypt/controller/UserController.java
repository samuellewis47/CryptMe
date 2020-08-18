package crypt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import crypt.form.SignupForm;
import crypt.service.UserService;
import crypt.validator.SignupValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/signup")
	public ModelAndView signup() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("signupForm", new SignupForm());
		mav.setViewName("signup");
		return mav;
	}
	
	@PostMapping(value = "/signupProcess")
	public ModelAndView signupProcess(@Valid @ModelAttribute("signupForm") SignupForm signupForm, BindingResult result) {
		
		ModelAndView mav = new ModelAndView();
		SignupValidator validator = new SignupValidator();
		validator.validate(signupForm, result);
		
		if(!result.hasErrors()) {
			userService.addUser(signupForm);
		}
		
		mav.setViewName("signup");
		return mav;
	}
}
