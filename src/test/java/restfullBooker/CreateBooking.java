package restfullBooker;

import io.restassured.RestAssured;

public class CreateBooking {
	public static void main(String[] args) {
		
	RestAssured.given().body("{\r\n"
			+ "\"firstname\" : \"Jim\",\r\n"
			+ "    \"lastname\" : \"Brown\",\r\n"
			+ "    \"totalprice\" : 111,\r\n"
			+ "    \"depositpaid\" : true,\r\n"
			+ "    \"bookingdates\" : {\r\n"
			+ "        \"checkin\" : \"2018-01-01\",\r\n"
			+ "        \"checkout\" : \"2019-01-01\"\r\n"
			+ "    },\r\n"
			+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
			+ "}'").contentType("application/json").when().post("https://restful-booker.herokuapp.com/booking")
	.then().statusCode(200).log().all();
	}
	

}
