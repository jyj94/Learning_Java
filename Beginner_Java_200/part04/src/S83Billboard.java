import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.io.Serializable;

public class S83Billboard implements Serializable {
    private int rank;
    private String song;
    private int lastWeek;
    private String imagesrc;
    private String artistsrc;
    private String artist;
//    생성자
    public S83Billboard() {}
    public S83Billboard(int rank, String song, int lastWeek, String imagesrc, String artistsrc, String artist) {
        super();
        this.rank = rank;
        this.song = song;
        this.lastWeek = lastWeek;
        this.imagesrc = imagesrc;
        this.artistsrc = artistsrc;
        this.artist = artist;
    }
    public S83Billboard(int rank,String song, int lastWeek, String imagesrc, String artist) {
        super();
        this.rank = rank;
        this.song = song;
        this.lastWeek = lastWeek;
        this.imagesrc = imagesrc;
        this.artistsrc = artistsrc;
    }
//    메소드
    @Override
    public String toString() {
        return "[rank = " + rank + ", song = " + song + ", lastweek = " + lastWeek +
                ", imagesrc = " + imagesrc + ", artist = " + artist + "]";
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
    public int getLastWeek() {
        return lastWeek;
    }
    public void setLastWeek(int lastWeek) {
        this.lastWeek = lastWeek;
    }
    public String getImagesrc() {
        return imagesrc;
    }
    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }
    public String getArtistsrc() {
        return artistsrc;
    }
    public void setArtistsrc(String artistsrc) {
        this.artistsrc = artistsrc;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
}
