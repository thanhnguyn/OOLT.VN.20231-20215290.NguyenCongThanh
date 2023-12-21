package AimsProject.src.hust.soict.hedspi.aims.store;

import AimsProject.src.hust.soict.hedspi.aims.media.Book;
import AimsProject.src.hust.soict.hedspi.aims.media.CompactDisc;
import AimsProject.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    private int nbItems = 0;
    public void addMedia(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        nbItems += 1;
        System.out.println("The disc is added to store!");
    }
    public void addMedia(Book book) {
        itemsInStore.add(book);
        nbItems += 1;
        System.out.println("The book is added to store!");
    }

    public void addMedia (CompactDisc disc)
    {
        itemsInStore.add(disc);
        nbItems += 1;
        System.out.println("The disc is added to store!");
    }

    public void removeMedia(DigitalVideoDisc dvd) {
        try {
            itemsInStore.remove(dvd);
            nbItems -= 1;
            System.out.println("The disc is removed from store!");
        }
        catch (Exception e) {
            System.out.println("Disc doesn't exist!");
            return ;
        }
    }
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

}
