import Search.FileSearch;

import java.io.File;
import java.util.Scanner;

/**
 * Created by rhy704 on 9/22/16.
 */
public class Runner {

    private Runner(){}

    private static String searchChoice;
    private static String fileName = null;

    public static String getSearchChoice() {
        return searchChoice;
    }

    public static void setSearchChoice(String searchChoice) {
        if(searchChoice.equalsIgnoreCase("f") || searchChoice.equalsIgnoreCase("k")) {
            Runner.searchChoice = searchChoice.toLowerCase();
        }
        else {
            System.out.println("Please enter an 'F' or a 'K'");
        }
    }

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        Runner.fileName = fileName;
    }

    public static void fileOrDirecLogic(String location) {
        if(searchChoice.equalsIgnoreCase("k")) {
            // do something
        }
        else if(searchChoice.equalsIgnoreCase("f")) {
            FileSearch fileSearch = new FileSearch();
            fileSearch.setFile(new File(location));
            fileSearch.searcher(fileSearch.getFile());

        }
        else {
            System.out.println("invalid entry, try again");
        }
    }




    public static void main(String[] args) {

        System.out.print("Searching for file name or keyword? (F or K): ");
        Scanner scan = new Scanner(System.in);

        Runner.setSearchChoice(scan.next());
        System.out.println("testing " + Runner.getSearchChoice());
        Runner.fileOrDirecLogic("/Users/rhy704/Documents/JPractice");

    }

}
