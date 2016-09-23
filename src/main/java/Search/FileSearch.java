package Search;

import java.io.File;
import java.io.IOException;

/**
 * Created by rhy704 on 9/22/16.
 */
public class FileSearch {

    private File file;
    private String name;
    private boolean found = false;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public File getFile() { return file; }

    public void setFile(File file) { this.file = file; }

    public void searcher(File file) {
            for (File each : file.listFiles()) {
                if (each.isDirectory()) {
                System.out.println(each.getName() + " is a directory");
                    searcher(each);
                } else {
                System.out.println(each.getName() + " is a file");
                    if (name.equalsIgnoreCase(each.getName())) {
                        System.out.println("FOUND YA: " + each.getAbsolutePath());
                        found = true;
                    }
                }
                if(found == true) {
                    break;
                }
            }
    }
}
