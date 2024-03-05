/**
 * myFileReader - allows for a CSV file to be read
 * @author Professor Mansouri  and esther greene 
 * @version March 4, 2024
 */

package accidentpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class myFileReader {
    
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    /**
     * LocalDate used to determine date (local)
     * @param dateTimeString The date and time from the accidents Report
     * @return localDate Local date
     */
    public static LocalDate dateConvert(String dateTimeString)
    {
        dateTimeString = dateTimeString.split("\\.")[0];

        LocalDate localDate;
        try {
            localDate = LocalDate.parse(dateTimeString, formatter);
          } catch (Exception e) {
            // Handle parsing exception, e.g., invalid format, invalid date
            System.err.println("Error parsing date-time string: " + e.getMessage());
            localDate = null;
          }
        return localDate;
    }
    
    /**
     * lineToReport Used to print the CSV accidents file to the console window
     * @param inputLine The CSV file to Report
     * @return r The new Report
     */
    private static Report lineToReport(String inputLine)
    {
        String[] items = inputLine.split(",");
        String id = items[0];
        int severity = Integer.parseInt(items[1]);
        LocalDate startTime = dateConvert(items[2]);
        LocalDate endTime = dateConvert(items[3]);
        String street = items[4];
        String city = items[5];
        String county = items[6];
        String state = items[7];
        int temperature = Integer.parseInt(items[8].split("\\.")[0]);
        int humidity = Integer.parseInt(items[9].split("\\.")[0]);
        int visibility = Integer.parseInt(items[10].split("\\.")[0]);
        String weatherCondition = items[11];
        boolean crossing = Boolean.parseBoolean(items[12]);
        boolean sunrise = items[13].equals("Night")?true:false;
        Report r = new Report(id, severity, startTime, endTime, street, city, county, state,
                temperature, humidity, visibility, weatherCondition, crossing, sunrise);
        return r;
    }
    
    /**
     * 
     * @param csvFilePath Path used by the CSV file
     * @param inputState Checks to see if the file path is correct
     * @return linkedList A LinkedList of the muLinkedList class
     * @throws FileNotFoundException Exception to be thrown if the file cannot be read
     */
    public static myLinkedList readFileToLinkedList(String csvFilePath, String inputState) throws FileNotFoundException
    {
        myLinkedList linkedList = new myLinkedList();
        Scanner scanner = new Scanner(new File(csvFilePath));
        //Skip the header line
        scanner.nextLine(); 
        int counter = 1;
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            Report r = myFileReader.lineToReport(line);
            // in this assignment we are interested only in reports of a specified state
            if(!r.getState().equals(inputState))
                continue;
            
            linkedList.add(r);
            counter+=1;
            // using this to view progress
            if(counter%1000==0)
                System.out.println(counter + " records added");
        }
        return linkedList;
    }
}
