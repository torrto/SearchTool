import Search.FileSearch;

import java.io.File;
import java.util.Scanner;

/**
 * Created by rhy704 on 9/22/16.
 */
public class Runner {

    private String searchChoice = "";
    private final FileSearch fileSearch = new FileSearch();
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public FileSearch getFileSearch() {
        return fileSearch;
    }

    public String getSearchChoice() {
        return searchChoice;
    }

    public void setSearchChoice(String searchChoice, String location) {
        setStartTime();
        if(searchChoice.equalsIgnoreCase("f") || searchChoice.equalsIgnoreCase("k")) {
            this.searchChoice = searchChoice.toLowerCase();
            fileOrDirecLogic(location);
        }
        else {
            System.out.println("Please enter an 'F' or a 'K'");
        }
    }

    public void setFileName(String fileName) {
        fileSearch.setName(fileName);
    }

    public void fileOrDirecLogic(String location) {
        if(searchChoice.equalsIgnoreCase("k")) {
            // do something
        }
        else if(searchChoice.equalsIgnoreCase("f")) {
            fileSearch.setFile(new File(location));
            fileSearch.searcher(fileSearch.getFile());

        }
        else {
            System.out.println("invalid entry, try again");
        }
    }






    public static void main(String[] args) {

        System.out.println("Your keyword to search on");
        Runner runner = new Runner();
        Scanner scan = new Scanner(System.in);
        runner.setFileName(scan.next());
        System.out.print("Searching for file name or keyword? (F or K): ");


        runner.setSearchChoice(scan.next(), "/Users/rhy704/");
        runner.setEndTime();

        System.out.println("Time take: " + (runner.getEndTime() - runner.getStartTime()));

    }

}
