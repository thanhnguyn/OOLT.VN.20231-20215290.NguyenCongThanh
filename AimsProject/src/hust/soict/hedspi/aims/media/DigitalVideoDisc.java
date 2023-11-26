package AimsProject.src.hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
//		super(title, category, director, length, cost);
        this(director,category,title,cost);
        this.setLength(length);
        this.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title){
        super(title);
        this.nbDigitalVideoDiscs ++;
        this.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String category, String title, float cost){
        this(title);
        this.setCategory(category);
        this.setCost(cost);
//		this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost){
        this(category,title,cost);
        this.setDirector(director);
        this.setId(nbDigitalVideoDiscs);
    }

    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }

    public int getNbDigitalVideoDiscs(){
        return nbDigitalVideoDiscs;
    }
    @Override
    public String toString(){
        return ("DVD - " + this.getTitle()
                + " - " + this.getCategory()
                + " - " + this.getDirector()
                + " - " + this.getLength()
                + ": " + this.getCost() + "$");
    }

}