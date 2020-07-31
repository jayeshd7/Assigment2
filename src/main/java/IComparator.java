import java.io.File;
import java.io.IOException;

public interface IComparator {

    public boolean compare(X x, Y y) ;
    public Wrapper<X, Y> getData(File file1, File file2) throws IOException;
}
