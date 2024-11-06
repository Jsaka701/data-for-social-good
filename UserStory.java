public class UserStory {

    private ChartInfo[] songs;

    //Initializes songs array using files for names, artists, and release dates
    public UserStory(String namesFile, String artistsFile, String releaseDatesFile) {
        songs = createChartInfoArray(namesFile, artistsFile, releaseDatesFile);
    }

   
    private ChartInfo[] createChartInfoArray(String namesFile, String artistsFile, String releaseDatesFile) {

 // Read data from files into arrays
        String[] names = FileReader.toStringArray(namesFile);
        String[] artists = FileReader.toStringArray(artistsFile);
        int[] releaseDates = FileReader.toIntArray(releaseDatesFile);

// Fill tempSongs array with song details like names, artists, and release dates matching it with the index
        ChartInfo[] tempSongs = new ChartInfo[names.length];
        for (int i = 0; i < names.length; i++) {
            tempSongs[i] = new ChartInfo(names[i], artists[i], releaseDates[i]);
        }
        return tempSongs;
    }

// Method to print all songs from a given year
  public void printSongsByYear(int year) {
    System.out.println("Top songs still from the year " + year + ":");

    int count = 0; //counter for amount of songs
    for (ChartInfo song : songs) { //Enhanced For Loop that loops through each song in the songs array
        if (song.getReleaseDate() == year) { // Checks if the song's release date matches the given year from the user input
            System.out.println(song.getName() + " by " + song.getArtist()); // Print the name and artist from the song that matches the year
            count++; // Increases the count by one
        }
    }

      // Prints the total count of songs and if no songs were found prints out a different message
        if (count > 0) {
            System.out.println("Total top songs still from the " + year + ": " + count);
        } else {
            System.out.println("There were no top songs still found for the year " + year);
        }
    }
}