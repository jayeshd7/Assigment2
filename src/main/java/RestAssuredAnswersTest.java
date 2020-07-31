
import java.io.File;
import java.io.IOException;


public class RestAssuredAnswersTest {

    public static void main(String[] args) throws IOException {
        GetAPICompare getAPICompare = new GetAPICompare();
        getAPICompare.getCompareFile(new File ("File1.txt"), new File("File2.txt"));


    }




}