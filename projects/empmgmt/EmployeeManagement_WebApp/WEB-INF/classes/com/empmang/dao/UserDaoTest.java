package com.empmang.dao;
import org.junit.Test;
import junit.framework.TestCase;

import com.empmang.dao.DepartmentDao;
import com.empmang.model.DepartmentTO;
import com.empmang.model.UserTO;

import java.util.List;


/** This class contains one testXXXX method per XXXXX method in source class
* @author 
**/
//TODO Add Junit jar in build path.
//TODO Modify input and output data if needed.


public class UserDaoTest extends TestCase {
	

	@Test //public void addDepart(String)
	public void testgetUserdetails(){
		UserDao e0Obj = new UserDao();
		UserTO etObj=new UserTO();
		etObj.setUserid("100");
		etObj.setRole("ADMIN");
		etObj.setPassword("madhav");
		try{
		 e0Obj.getUserDetails(etObj);
			//assertNotNull(e0);
		}catch(Exception e){
			fail();
		}
	}
	

	
	

}
