package restfullBooker;

import io.restassured.RestAssured;

public class GetBookingIds {
	public static void main(String[] args) {
		RestAssured.given()
		.when().get("https://restful-booker.herokuapp.com/booking")
		.then().statusCode(200)
		.log().all();
	}
}
