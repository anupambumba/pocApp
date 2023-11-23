package springboothelloworld.helloworld.controller;  

import java.io.InputStream;

import org.apache.wink.json4j.JSON;
import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONObject;
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
		idCardAuthorization.setIsAuthorized("true");
		
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
	@GetMapping("/getIDCardDetails")
	public String getIDCardDetails() throws JsonProcessingException
	{
		String autrizeStr=null;
		try {
			JSONObject memberIDCardDetailsJsonObject = null;
			String memberIDCardDetailseFileName = "/ACES0764M495291_ID_Card_soa.json";
			

			InputStream in = this.getClass().getResourceAsStream(memberIDCardDetailseFileName);
	        if(in!=null){
	        	memberIDCardDetailsJsonObject = (JSONObject) JSON.parse(in);
	        }
	        
	        autrizeStr=memberIDCardDetailsJsonObject.toString();
		}catch (Exception e) {
			ErrorDetails errDet=new ErrorDetails();
			errDet.setErrorDetails(e.toString());
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			autrizeStr = ow.writeValueAsString(errDet);
		}
	
		
		return autrizeStr;
	}
}
