import java.io.*;

public class getAPICompare implements IComparator {


    @Override
    public boolean compare(X x, Y y) {
        return false;
    }

    @Override
    public Wrapper<X, Y> getData(File file1, File file2) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        BufferedReader br2 = new BufferedReader(new FileReader(file2));

        String st1, st2;
        String file1response,file2response;

        while (true){
            st1 = br1.readLine();
            st2 = br2.readLine();
            if (st1 != null && st2 != null ){
                file1response = RestAssuredAnswersTest.GetAPIResponse(st1);
                file2response = RestAssuredAnswersTest.GetAPIResponse(st2);

            }
            else{
                if(st1 == null && st2 == null){
                    break;
                }
                if (st1 == null){
                    file2response = RestAssuredAnswersTest.GetAPIResponse(st2);
                }
                else{
                    file1response = RestAssuredAnswersTest.GetAPIResponse(st1);
                }
            }
        }


        return null;
    }
}
