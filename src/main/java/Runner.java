import Search.FileSearch;

import java.io.File;
import java.util.Scanner;

/**
 * Created by rhy704 on 9/22/16.
 */
public class Runner {

    private Runner(){}

    public static void setFileName(String fileName) {
        FileSearch.setName(fileName);
    }

    public static void fileOrDirecLogic(String location) {
        FileSearch.setFile(new File(location));
        FileSearch.searcher(FileSearch.getFile());
    }






    public static void main(String[] args) {
        System.out.println("Your keyword to search on");
        Scanner scanner = new Scanner(System.in);
        Runner.setFileName(scanner.next());
        Runner.fileOrDirecLogic("/Users/danielmelton");

        int messagesSize = FileSearch.getMessages().size();

        for(int i = 0; i < messagesSize; i++) {
            System.out.println(FileSearch.getMessages().get(i));
        }
    }

}
