import java.io.File;
import java.io.IOException;

public interface IComparator {

    public boolean compareResponse(String x, String y) ;
    public void getCompareFile(File file1, File file2) throws IOException;
}
