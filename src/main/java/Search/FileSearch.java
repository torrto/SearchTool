package Search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rhy704 on 9/22/16.
 */
public class FileSearch {

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void searcher(File file) {
                for(File each: file.listFiles()) {
                    if(each.isDirectory()) {
                        System.out.println(each.getName() + " is a directory");
                        searcher(each);
                    }
                    else {
                        System.out.println(each.getName() + " is a file");
                    }
                }
        }
}
