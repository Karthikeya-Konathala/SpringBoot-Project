package com.klu.CRS_SDP3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class registerService {
	
	@Autowired
	  registerRepo regrepository;
	  
	  public void addregisterrecord(register reg) {
	    regrepository.save(reg);
	  }
	  public register checkUser(String email,String pswd) {
		  return regrepository.checkUser(email, pswd);
	  }
	 public List<register> listallusers(){
		 return regrepository.findAll(); 
	 }

}
