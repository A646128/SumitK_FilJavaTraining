import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ValidateResponseHeader {
@Test
public void GetWeatherHeaders()
{
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("/Hyderabad");
 
	// Reader header of a give name. In this line we will get
	// Header named Content-Type
	String contentType = response.header("Content-Type");
	System.out.println("Content-Type value: " + contentType);
 
	// Reader header of a give name. In this line we will get
	// Header named Server
	String serverType =  response.header("Server");
	System.out.println("Server value: " + serverType);
 
	// Reader header of a give name. In this line we will get
	// Header named Content-Encoding
	String acceptLanguage = response.header("Content-Encoding");
	System.out.println("Content-Encoding: " + acceptLanguage);
	
	// Get all the headers. Return value is of type Headers.
		// Headers class implements Iterable interface, hence we
		// can apply an advance for loop to go through all Headers
		// as shown in the code below
		Headers allHeaders = response.headers();
	 
		// Iterate over all the Headers
		for(Header header : allHeaders)
		{
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
}
}
