/**   
 * Copyright © 2020 LiaoLiang.
 * 
 * @Package: edu.bjtu.javaee.controller 
 * @author: 小江   
 * @date: 2020年3月4日 上午8:48:20 
 */
package edu.bjtu.javaee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.bjtu.javaee.model.SignUpForm;

/** 
 * @ClassName: SignUpController 
 * @Description: SignUpController class for User sign up form processing
 */
@Controller
public class SignUpController {
	
	@ModelAttribute("signUpForm")
	public SignUpForm setSignUpForm() {
		return new SignUpForm();
	}
	
	@GetMapping("/signup")
	public String showForm() {
		return "signup-form";
	}
	
	@RequestMapping(value = "/received", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("signUpForm") SignUpForm signUpForm) {

		// Implement business logic to save user details into a database
		// .....

		System.out.println("FirstName : " + signUpForm.getFirstName());
		System.out.println("LastName : " + signUpForm.getLastName());
		System.out.println("Username : " + signUpForm.getUserName());
		System.out.println("Password : " + signUpForm.getPassword());
		System.out.println("Email : " + signUpForm.getEmail());
		
		ModelAndView mv = new ModelAndView();
        mv.setViewName("signup-success");
        mv.addObject("message", "SignUp Successful.");
        mv.addObject("user", signUpForm);
        
        return mv;
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String evening(Model model) {
		model.addAttribute("message", "Good Evening!!!");

		return "welcome";
	}
}
