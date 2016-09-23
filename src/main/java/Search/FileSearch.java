package Search;

import java.io.File;

/**
 * Created by rhy704 on 9/22/16.
 */
public class FileSearch {

    private static File file;
    private static String name;
    private static boolean found = false;

    private FileSearch(){}

    public static String getName() { return name; }

    public static void setName(String name) { FileSearch.name = name; }

    public static File getFile() { return file; }

    public static void setFile(File file) { FileSearch.file = file; }

    public static void searcher(File file) {
            for (File each : file.listFiles()) {
                if (each.isDirectory()) {
                System.out.println(each.getName() + " is a directory");
                    searcher(each);
                } else {
                System.out.println(each.getName() + " is a file");
                    if (FileSearch.name.equalsIgnoreCase(each.getName())) {
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
