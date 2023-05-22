package com.klu.CRS_SDP3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class registerController {
	@Autowired
	registerService regservice;
	
	@GetMapping("/index")
	  public String index()
	  {
	    return "index";
	  }
	
	@GetMapping("/register")
	  public String register()
	  {
	    return "register";
	  }
	
	@GetMapping("/signin")
	  public String signin()
	  {
	    return "signin";
	  }
	
	@GetMapping("/afterjobsee")
	  public String afterjobsee()
	  {
	    return "afterjobsee";
	  }
	
	@GetMapping("/afterrecr")
	  public String afterrecr()
	  {
	    return "afterrecr";
	  }
	@GetMapping("/assign")
	  public String assign()
	  {
	    return "assign";
	  }
	@GetMapping("/jobrecom")
	  public String jobrecom()
	  {
	    return "jobrecom";
	  }
	@GetMapping("/mycandi")
	  public String mycandi()
	  {
	    return "mycandi";
	  }
	@GetMapping("/recrupostaj")
	  public String recrupostaj()
	  {
	    return "recrupostaj";
	  }
	@GetMapping("/resume")
	  public String resume()
	  {
	    return "resume";
	  }
	@GetMapping("/test")
	  public String test()
	  {
	    return "test";
	  }
	@PostMapping("/login")
	  public ModelAndView submitregdata(@ModelAttribute("reg") register reg) {
	    regservice.addregisterrecord(reg);
	    
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("login");
	    
	    return mv;
	  }
	@PostMapping("/checkuser")
	  public ModelAndView checkUser(HttpServletRequest request) {
	    ModelAndView mv = new ModelAndView();
	    String email = request.getParameter("email");
	    String pswd = request.getParameter("pswd");
	    register register = regservice.checkUser(email, pswd);
	    if(register!=null ) {
	      HttpSession session = request.getSession();
	      session.setAttribute("email", email);
	      mv.setViewName("afterrecr");
	    }
	    else {
	      mv.setViewName("error");
	      mv.addObject("msg", "Login Failed");
	    }
	    return mv;
	  }
	@GetMapping("/listusers")
	public ModelAndView listUsers() {
		ModelAndView mv=new ModelAndView("mycandi");
		mv.addObject("userlist", regservice.listallusers());
		return mv;
	}
}
