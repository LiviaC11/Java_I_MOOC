
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // hanno stesso indirizzo in memoria
        }

        if (!(obj instanceof Song)) {
            return false;
        }

        Song newSong = (Song) obj;

        return newSong.name.equals(this.name) && newSong.artist.equals(this.artist)
                && newSong.durationInSeconds == this.durationInSeconds;
    }

}
