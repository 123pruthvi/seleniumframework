package restfullBooker;

import io.restassured.RestAssured;

public class GetBookingId {
	public static void main(String[] args) {
	
		RestAssured.given().pathParam("id", "15")
		.when().get("https://restful-booker.herokuapp.com/booking/{id}")
		.then().statusCode(200)
		.log().all();
	}

}
