package in.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.com.app.model.User;
import in.com.app.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", new User());
		mav.setViewName("userView");
		return mav;
	}

	@PostMapping("/user")
	public ModelAndView handleSubmit(User user) {
		String msgTxt = userService.saveUser(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("userView");
		return mav;
	}
}
