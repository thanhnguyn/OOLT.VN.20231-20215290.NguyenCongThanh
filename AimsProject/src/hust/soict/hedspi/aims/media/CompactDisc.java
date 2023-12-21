package AimsProject.src.hust.soict.hedspi.aims.media;

import java.util.ArrayList;
//import hust.soict.dsai.aims.media.Track;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String director, String dunno, int length, float cost) {
    	super(title, category, director, length, cost);
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setCost(cost);
        this.setLength(length);
    }

    public CompactDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
//		this.id = nbDigitalVideoDiscs;
    }

    public CompactDisc(String title, String category, String director, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setCost(cost);
//        this.setId(nbDigitalVideoDiscs);
    }

    public CompactDisc(String artist) {
        super();
        this.setArtist(artist);
    }

    public void addTrack(Track newTrack) {
        if (this.tracks.contains(newTrack)) {
            System.out.println("Track already exists!");
            return;
        }
        this.tracks.add(newTrack);
        System.out.println("Track is added!");
    }

    public void removeTrack(Track track) {
        if (this.tracks.contains(track)) {
            this.tracks.remove(track);
            System.out.println("Track is removed!");
            return;
        }
        System.out.println("Track does not exist!");
    }

    public String[] play() {
        System.out.println("CD contains " + this.tracks.size() + " tracks!");
        System.out.println("Tracks:");
        int i = 0;
        for (Track track : tracks) {
            System.out.println(i++ + ". " + track.getTitle());
        }
        for (Track track : tracks) {
            track.play();
        }
        return new String[0];
    }

    @Override
    public int getLength() {
        int sum = 0;
        for (Track track : tracks) {
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
    public String toString() {
        return ("CD - " + this.getTitle()
                + " - " + this.getCategory()
                + " - " + this.getDirector()
                + " - " + this.getLength()
                + ": " + this.getCost() + "$");
    }
}