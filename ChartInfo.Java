public class ChartInfo {
    private String name;       // Variable Song name
    private String artist;     // Variable Artist name
    private int releaseDate;   // Variable Release year

//Parameterized Constructor that uses inputed Instance Variables
    public ChartInfo(String name, String artist, int releaseDate) {
        this.name = name;
        this.artist = artist;
        this.releaseDate = releaseDate;
    }


//Getter Methods for Instance Variable Name, Artist, ReleaseDate 
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

//To String method to format when printed out
    public String toString() {
        return "Song: " + name + " | Artist: " + artist + " | Release Year: " + releaseDate;
    }
}
