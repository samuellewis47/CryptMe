package crypt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import crypt.form.LoginForm;
import crypt.service.UserService;

@Controller
public class SessionController {
	
	private static final String LOGIN = "login";
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginForm", new LoginForm());
		mav.setViewName(LOGIN);
		return mav;
	}
	
	@PostMapping(value = "/loginProcess")
	public ModelAndView loginProcess(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult result) {
		
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName(LOGIN);
			return mav;
		}
		
		if(userService.authenticateUser(loginForm)) {
			mav.setViewName("profile");
			return mav;
		}
		
		mav.setViewName(LOGIN);
		return mav;
	}
	
	@RequestMapping("/profile")
	public ModelAndView profile() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("profile");
		return mav;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginForm", new LoginForm());
		mav.setViewName(LOGIN);
		return mav;
	}
	
}
