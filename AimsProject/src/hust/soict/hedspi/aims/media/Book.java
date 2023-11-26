package AimsProject.src.hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost) {
//    	super(title, category, director, length, cost);
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public Book(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
//		this.id = nbDigitalVideoDiscs;
    }

    public void addAuthor(String authorName) {
        for(String author: authors) {
            if(author.equals(authorName)) {
                System.out.println("Author is already added!");
                return ;
            }
        }
        authors.add(authorName);
        System.out.println("Author is added!");
    }
    public void removeAuthor(String authorName) {
        for(String author: authors) {
            if(author.equals(authorName)) {
                authors.remove(authorName);
                System.out.println("Author is removed!");
                return ;
            }
        }
        System.out.println("Author is not added yet!");
    }

    public List<String> getAuthors() {
        return authors;
    }


    public String toString() {
        return ("Book - " + this.getTitle()
                + " - " + this.getCategory()
                + ": " + this.getCost() + "$");
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
