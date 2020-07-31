

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RestAssuredAnswersTest {

    public static void main(String[] args) throws IOException {
        File file = new File("File1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            GetAPIResponse(st);


    }

    public static String GetAPIResponse(String url) {

        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(url);
        if (response.statusCode() == 200) {
            String responseBody = response.asString();
            return responseBody;
        }
        else{
            return "Invalid API Response" + '\t' + response.statusCode();
        }

    }








}