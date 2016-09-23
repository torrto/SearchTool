import Search.FileSearch;

import java.io.File;
import java.util.Scanner;

/**
 * Created by rhy704 on 9/22/16.
 */
public class Runner {

    private Runner(){}

    private static String searchChoice = "";

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

    public static void setFileName(String fileName) {
        FileSearch.setName(fileName);
    }

    public static void fileOrDirecLogic(String location) {
        if(searchChoice.equalsIgnoreCase("k")) {
            // do something
        }
        else if(searchChoice.equalsIgnoreCase("f")) {
            FileSearch.setFile(new File(location));
            FileSearch.searcher(FileSearch.getFile());

        }
        else {
            System.out.println("invalid entry, try again");
        }
    }




    public static void main(String[] args) {
        System.out.println("Your keyword to search on");
        Scanner scanner = new Scanner(System.in);
        Runner.setFileName(scanner.next());
        System.out.print("Searching for file name or keyword? (F or K): ");
        Scanner scan = new Scanner(System.in);
        Runner.setSearchChoice(scan.next());
        Runner.fileOrDirecLogic("/Users/rhy704/");

    }

}
