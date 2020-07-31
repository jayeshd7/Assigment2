import java.io.*;

public class GetAPICompare implements IComparator {

    GetAPIResponse getAPIResponse = new GetAPIResponse();

    @Override
    public boolean compareResponse(String x, String y) {
        return x.contentEquals(y);

    }

    @Override
    public void getCompareFile(File file1, File file2) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        BufferedReader br2 = new BufferedReader(new FileReader(file2));

        String st1, st2;
        String file1response, file2response;
        Boolean compare;
        while (true) {

            st1 = br1.readLine();
            st2 = br2.readLine();
            if (st1 != null && st2 != null) {
                file1response = getAPIResponse.fetchAPIResponse(st1);
                file2response = getAPIResponse.fetchAPIResponse(st2);
                compare = compareResponse(file1response, file2response);
                if (compare) {
                    System.out.println(st1 + " equals " + st2);
                } else {
                    System.out.println((st1 + " not equals " + st2));
                }

            } else {
                if (st1 == null && st2 == null) {
                    break;
                }
                if (st1 == null) {
                    System.out.println("No API url available in file1 for corresponding line in file2 :" + st2);
                } else {
                    System.out.println("No API url available in file1 for corresponding line in file1 :" + st1);

                }
            }

        }


    }
}
