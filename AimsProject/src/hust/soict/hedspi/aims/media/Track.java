package AimsProject.src.hust.soict.hedspi.aims.media;

import AimsProject.src.hust.soict.hedspi.aims.media.Playable;
public class Track implements Playable{

    private String title;
    private int length;
    public Track() {
        // TODO Auto-generated constructor stub
    }
    public Track(String title, int length) {
        this.setLength(length);
        this.setTitle(title);
    }

    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Track track = (Track) obj;
        return title.equals(track.title) && length == track.length;
    }
}
