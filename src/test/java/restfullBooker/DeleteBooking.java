package restfullBooker;

import io.restassured.RestAssured;

public class DeleteBooking {
	public static void main(String[] args) {
		
		RestAssured.given().contentType("application/json")
		.when().delete("application/json")
		.then().statusCode(200).log().all();
	}

}
