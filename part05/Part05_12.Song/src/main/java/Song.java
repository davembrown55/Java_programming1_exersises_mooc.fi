
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
    
    
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if ( !(compared instanceof Song)) {
            return false;
        }
        
        Song toCompare = (Song) compared;
        
        if (this.artist.equals(toCompare.getArtist()) &&
            this.name.equals(toCompare.getName()) &&
            this.durationInSeconds == toCompare.getDurationInSeconds()) {
            
            return true;
        } else {  
            return false;                
        }
    }
    

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
