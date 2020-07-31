import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class GetAPIResponseTest {
    /*
        Here we are using unit Test for GetAPIResponse
     */

    @ParameterizedTest
    @ValueSource(strings = {"https://reqres.in/api/users/1", "https://reqres.in/api/users/2"})
    void fetchAPIResponsePositive(String url) {
        GetAPIResponse getAPIResponse = new GetAPIResponse();
        String actual = getAPIResponse.fetchAPIResponse(url);

        assertTrue(!actual.contains("Invalid API Response"));

    }


    @ParameterizedTest
    @ValueSource(strings = {"https://reqres.in/api/users/1000", "https://reqres.in/api/users/2000"})
    void fetchAPIResponseNegative(String url) {
        GetAPIResponse getAPIResponse = new GetAPIResponse();
        String actual = getAPIResponse.fetchAPIResponse(url);

        assertTrue(actual.contains("Invalid API Response"));

    }


}
