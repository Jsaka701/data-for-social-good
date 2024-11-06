import java.util.Scanner;

public class DataRunner {

    public static void main(String[] args) {
      
 // Creates a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
      
// Creates UserStory object with parameters as data files for the song names, artists, and release dates
        UserStory userStory = new UserStory("names.txt", "artists.txt", "releaseDates.txt");

//Asks user what year they want to see all the top songs that are currently still trending
        System.out.println("Enter a year to see all top songs still trending from that year: ");

//Read users input and stores the int as year
        int year = scanner.nextInt();

//Calls the printSongsByYear method and displays all songs from the year inputted from user
        userStory.printSongsByYear(year);

//Closes the scanner
        scanner.close();
    }
}