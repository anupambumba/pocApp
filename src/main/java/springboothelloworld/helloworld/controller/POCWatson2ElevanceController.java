package springboothelloworld.helloworld.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.io.IOUtils;
import org.apache.wink.json4j.JSON;
import org.apache.wink.json4j.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import springboothelloworld.helloworld.pojo.ErrorDetails;
import springboothelloworld.helloworld.pojo.IDCardAuthorization;
import springboothelloworld.helloworld.pojo.IDCardImage;
import springboothelloworld.helloworld.pojo.UserDetails;

@RestController
@RequestMapping(path = "/poc")
@Api(value = "POCWatson2ElevanceController", tags = { "IDCard Controller" })
@SwaggerDefinition(tags = { @Tag(name = "IDCard Controller", description = "Write description here") })
public class POCWatson2ElevanceController {
	@CrossOrigin(origins = "*")
	@GetMapping(path = "/")
	public String home() throws JsonProcessingException {
		String autrizeStr = "Home page of the application";

		return autrizeStr;
	}

	@CrossOrigin(origins = "*")
	@GetMapping(path = "/ping")
	public String ping() throws JsonProcessingException {
		String autrizeStr = "Deployed successfully......";

		return autrizeStr;
	}

	@CrossOrigin(origins = "*")
	@PostMapping(path = "/checkauth")
	public String checkAuth(@RequestBody String userDetails) throws JsonProcessingException {

		String autrizeStr = null;
		UserDetails userDetailsObj = new ObjectMapper().readValue(userDetails, UserDetails.class);
		IDCardAuthorization idCardAuthorization = new IDCardAuthorization();
		if (userDetailsObj.getMemberId().equalsIgnoreCase("ACES0764M495291")|| userDetailsObj.getMemberId().equalsIgnoreCase("311705865")) {
			idCardAuthorization.setIsAuthorized("success");
		} else {
			idCardAuthorization.setIsAuthorized("failure");
		}

		try {
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			autrizeStr = ow.writeValueAsString(idCardAuthorization);
		} catch (JsonProcessingException e) {
			ErrorDetails errDet = new ErrorDetails();
			errDet.setErrorDetails(e.toString());
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			autrizeStr = ow.writeValueAsString(errDet);
		}

		return autrizeStr;
	}

	@CrossOrigin(origins = "*")
	@GetMapping(path = "/getidcarddetails")
	public String getIDCardDetails(@RequestParam String memberID) throws JsonProcessingException {
		String autrizeStr = null;
		try {
			JSONObject memberIDCardDetailsJsonObject = null;
			System.out.println(memberID);
			String memberIDCardDetailseFileName = null;
			if (memberID.equalsIgnoreCase("ACES0764M495291")) {
				memberIDCardDetailseFileName = "/ACES0764M495291_ID_Card_soa.json";
			} else if (memberID.equalsIgnoreCase("311705865")) {
				memberIDCardDetailseFileName = "/311705865_ID_Card_soa.json";
			} else {
				memberIDCardDetailseFileName = null;
			}

			if (memberIDCardDetailseFileName != null) {
				InputStream in = this.getClass().getResourceAsStream(memberIDCardDetailseFileName);
				if (in != null) {
					memberIDCardDetailsJsonObject = (JSONObject) JSON.parse(in);
				}

				autrizeStr = memberIDCardDetailsJsonObject.toString();
			} else {
				ErrorDetails errDet = new ErrorDetails();
				errDet.setErrorDetails("There is some error. So the Id Card is not retrieved.");
				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				autrizeStr = ow.writeValueAsString(errDet);
			}

		} catch (Exception e) {
			ErrorDetails errDet = new ErrorDetails();
			errDet.setErrorDetails(e.toString());
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			autrizeStr = ow.writeValueAsString(errDet);
		}

		return autrizeStr;
	}

	@CrossOrigin(origins = "*")
	@GetMapping(path = "/getimage")
	public String getImage(@RequestParam String memberID, @RequestParam String recordId, @RequestParam String systemId)
			throws JsonProcessingException {
		String autrizeStr = null;

		IDCardImage idCardImage = new IDCardImage();

		if ((memberID.equalsIgnoreCase("ACES0764M495291") || memberID.equalsIgnoreCase("311705865"))
				&& (recordId.equalsIgnoreCase("11620756") || recordId.equalsIgnoreCase("7980853"))
				&& (systemId.equalsIgnoreCase("wellpointcentralnatga") || systemId.equalsIgnoreCase("wellpointaces"))) {
			byte imageData[];
			try {
				InputStream in = this.getClass().getResourceAsStream("/Front.png");
				imageData = IOUtils.toByteArray(in);
				in.read(imageData);
				String frontImageBase64 = Base64.getEncoder().encodeToString(imageData);
				in = this.getClass().getResourceAsStream("/Back.png");
				imageData = IOUtils.toByteArray(in);
				in.read(imageData);
				String backImageBase64 = Base64.getEncoder().encodeToString(imageData);
				byte[] frontImageBytes=DatatypeConverter.parseBase64Binary(frontImageBase64);
				byte[] backImageBytes=DatatypeConverter.parseBase64Binary(backImageBase64);
				String nameAppnder=String.valueOf(System.currentTimeMillis());		
				
				File frontImageOutputFile=new File("/image/"+nameAppnder+"_front.png");
				File backImageOutputFile=new File("/image/"+nameAppnder+"_back.png");
				frontImageOutputFile.createNewFile();
				backImageOutputFile.createNewFile();
				
				FileOutputStream outpoutFileStreamFront=new FileOutputStream(frontImageOutputFile);
				FileOutputStream outpoutFileStreamBack=new FileOutputStream(backImageOutputFile);
				outpoutFileStreamFront.write(frontImageBytes);
				outpoutFileStreamBack.write(backImageBytes);
				outpoutFileStreamFront.flush();
				outpoutFileStreamFront.close();
				outpoutFileStreamBack.flush();
				outpoutFileStreamBack.close();			
				
				
				idCardImage.setFrontImage(nameAppnder+"_front.png");
				idCardImage.setBackImage(nameAppnder+"_back.png");
				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				autrizeStr = ow.writeValueAsString(idCardImage);
			} catch (IOException e) {
				ErrorDetails errDet = new ErrorDetails();
				errDet.setErrorDetails(e.toString());
				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				autrizeStr = ow.writeValueAsString(errDet);
			}
		} else {
			ErrorDetails errDet = new ErrorDetails();
			errDet.setErrorDetails("The provided data is not proper. Hence it can not be retrieved.");
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			autrizeStr = ow.writeValueAsString(errDet);
		}

		return autrizeStr;
	}
	
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = "/image")
	public ResponseEntity<byte[]> getImage(@RequestParam String imageName) throws IOException {

		 HttpHeaders headers = new HttpHeaders();
	        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
	        headers.add("Pragma", "no-cache");
	        headers.add("Expires", "0");
	        String filePath = "/image/"+imageName;
	    InputStream inputStream = this.getClass().getResourceAsStream(filePath);
	    byte[] resource=IOUtils.toByteArray(inputStream);
	    return ResponseEntity.ok()
	            .headers(headers)
	            .contentType(MediaType.IMAGE_PNG)
	            .body(resource);
	}
}
