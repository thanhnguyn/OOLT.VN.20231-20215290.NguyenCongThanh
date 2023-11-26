package AimsProject.src.hust.soict.hedspi.aims.media;
import java.util.ArrayList;
//import hust.soict.hedspi.aims.media.Track;

public class CompactDisc extends Disc {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public CompactDisc() {
        // TODO Auto-generated constructor stub
    }
    public CompactDisc(String artist) {
        super();
        this.setArtist(artist);
    }

    public void addTrack(Track newTrack) {
        if(this.tracks.contains(newTrack)) {
            System.out.println("Track already exists!");
            return ;
        }
        this.tracks.add(newTrack);
        System.out.println("Track is added!");
    }
    public void removeTrack(Track track) {
        if(this.tracks.contains(track)) {
            this.tracks.remove(track);
            System.out.println("Track is removed!");
            return ;
        }
        System.out.println("Track does not exist!");
    }

    @Override
    public int getLength() {
        int sum = 0;
        for(Track track: tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
//	public ArrayList<Track> getTrack() {
//		return track;
//	}
//	public void setTrack(ArrayList<Track> track) {
//		this.track = track;
//	}


}
