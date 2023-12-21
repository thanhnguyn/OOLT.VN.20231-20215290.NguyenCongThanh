package AimsProject.src.hust.soict.hedspi.aims.media;

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

    public String[] play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
        return new String[0];
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
