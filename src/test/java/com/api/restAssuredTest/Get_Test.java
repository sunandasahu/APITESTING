package com.api.restAssuredTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Get_Test {
	
	@Test
	public void getWeatherDetails() {
		
		given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City", equalTo("Hyderabad"))
		.header("Contant-Type", "application/json");
		
		
	}
	

}
