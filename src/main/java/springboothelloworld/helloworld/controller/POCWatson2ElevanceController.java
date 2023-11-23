package springboothelloworld.helloworld.controller;  

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import springboothelloworld.helloworld.pojo.ErrorDetails;
import springboothelloworld.helloworld.pojo.IDCardAuthorization; 
@RestController

public class POCWatson2ElevanceController {

	@GetMapping("/checkAuth")
	public String checkAuth() throws JsonProcessingException
	{
		String autrizeStr=null;
	
		IDCardAuthorization idCardAuthorization=new IDCardAuthorization();
		idCardAuthorization.setIsAuthorized("true1111");
		
		try {
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			autrizeStr = ow.writeValueAsString(idCardAuthorization);
		} catch (JsonProcessingException e) {
			ErrorDetails errDet=new ErrorDetails();
			errDet.setErrorDetails(e.toString());
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			autrizeStr = ow.writeValueAsString(errDet);
		}
		
		return autrizeStr;
	}
}
