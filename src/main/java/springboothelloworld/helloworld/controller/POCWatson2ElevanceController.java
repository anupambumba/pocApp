package springboothelloworld.helloworld.controller;  

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController

public class POCWatson2ElevanceController {

	@GetMapping("/idCardAuthorize")
	public String HelloWorld()
	{
		String autrizeStr="{";
	
		autrizeStr=autrizeStr+"'isAuthorized':'true'}";
		
		return autrizeStr;
	}
}
