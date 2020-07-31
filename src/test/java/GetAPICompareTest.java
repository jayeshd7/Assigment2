import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class GetAPICompareTest {

    @Test
    void compareResponse() {
        GetAPICompare getAPICompare = new GetAPICompare();
        Boolean value = getAPICompare.compareResponse("abc", "abc");
        assertTrue(value);
    }

}