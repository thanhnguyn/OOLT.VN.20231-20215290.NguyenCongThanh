package AimsProject.src.hust.soict.hedspi.aims.media;


public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;

    private int id;

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor 2: Create a DVD object by category, title, and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor 3: Create a DVD object by director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor 4: Create a DVD object by all attributes: title, category, director, length, and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getDirector() {
        return director;
    }

    public String getCategory() {
        return category;
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

    public float getCost() {
        return cost;
    }

    public String toString() {
        return ("DVD - " + this.getTitle()
                + " - " + this.getCategory()
                + " - " + this.getDirector()
                + " - " + this.getLength()
                + ": " + this.getCost() + "$");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}