package com.klu.CRS_SDP3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface registerRepo extends JpaRepository<register,Integer>{
	register findByEmailAndPswd(String uname, String pswd);
	@Query("select u from register u where email=?1 and pswd=?2")
    public register checkUser(String email,String pswd);
}
