package lab1;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String album;
    private String length;

    public Song() {
    }

    public Song(String title, String artist, String album, String length) {
        this.artist = artist;
        this.album = album;
        this.length = length;
        this.title = title;
    }

    @Override
    public int compareTo(Song s) {
        return new CompareToBuilder()
                .append(this.title, s.title)
                .toComparison();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.artist);
        hash = 83 * hash + Objects.hashCode(this.album);
        hash = 83 * hash + Objects.hashCode(this.length);
        hash = 83 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + ", album=" + album + ", length=" + length + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        if (!Objects.equals(this.length, other.length)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getReleaseDate() {
        return title;
    }

    public void setReleaseDate(String releaseDate) {
        this.title = releaseDate;
    }
}
