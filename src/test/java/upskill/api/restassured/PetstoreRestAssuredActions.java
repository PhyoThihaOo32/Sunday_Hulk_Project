package upskill.api.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class PetstoreRestAssuredActions {

	public void createPet(){
		
		given().														//Request Payload
			body(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiRequestPayloads/CreatePetRequest.json")).
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			post("https://petstore.swagger.io/v2/pet").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));
	}
	
	public void updatePet(){
		
		given().														//Request Payload
		body(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiRequestPayloads/UpdatePetRequest.json")).
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			put("https://petstore.swagger.io/v2/pet").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/UpdatePetResponse.json")));
	}
	
	public void getPet(){
		
		given().														//Request Payload
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			header("bearer_token", "dfvhk42687rfehdvfj2368749ruvrv44f4kyj").		//Auth
			header("username", "upskill").
			header("password", "12345").
			header("AccessKey", "upskill").											//AWS
			header("SecretKey", "mhgcht47ituykuh6457gyiutf356g").
			header("AWS Region", "us-east").
			header("Service Name", "S3").
			header("Session Token", "kulgyyrdty8745hkjhfc876756").
			get("https://petstore.swagger.io/v2/pet/5").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/GetPetResponse.json")));
	}
	
	public void deletePet(){
		given().														//Request Payload
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			delete("https://petstore.swagger.io/v2/pet/5").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/DeletePetResponse.json")));
	}
}