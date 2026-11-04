package restfullBooker;

import io.restassured.RestAssured;

public class PartialUpdateBooking {
	public static void main(String[] args) {
		
		RestAssured.given().auth().preemptive().basic("admin", "password123")
		.pathParam("id", "15").body("{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\"\r\n"
				+ "}").contentType("application/json")
		.when().patch("https://restful-booker.herokuapp.com/booking/{id}")
		.then().statusCode(200).log().all();
		
	}

}
