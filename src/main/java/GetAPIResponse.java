import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;



public class GetAPIResponse {

    HashMap<String, String> hashMap = new HashMap<>();


    public GetAPIResponse() {
        //Singleton Constructor
    }


    public String fetchAPIResponse(String url) {
        String responseBody = hashMap.get(url);
        if(responseBody == null) {
            RequestSpecification httpRequest = RestAssured.given();
            Response response = httpRequest.get(url);
            if (response.statusCode() == 200) {
                responseBody = response.asString();

            } else {
                responseBody = "Invalid API Response" + '\t' + response.statusCode();

            }
            hashMap.put(url, responseBody);
        }
        return responseBody;
    }
}
