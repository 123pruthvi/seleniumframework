package restfullBooker;

import io.restassured.RestAssured;

public class UpdateBooking {
	public static void main(String[] args) {
		
		RestAssured.given().auth().preemptive().basic("admin", "password123") 
		.pathParam("id","15")
				.body("{\r\n"
						+ "    \"firstname\": \"mithun\",\r\n"
						+ "    \"lastname\": \"Smith\",\r\n"
						+ "    \"totalprice\": 2050,\r\n"
						+ "    \"depositpaid\": true,\r\n"
						+ "    \"bookingdates\": {\r\n"
						+ "        \"checkin\": \"2025-01-01\",\r\n"
						+ "        \"checkout\": \"2025-02-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\": \"Not\"\r\n"
						+ "}")
		.contentType("application/json")
		.when().put("https://restful-booker.herokuapp.com/booking/{id}")
		.then().statusCode(200)
		.log().all();
	}

}
