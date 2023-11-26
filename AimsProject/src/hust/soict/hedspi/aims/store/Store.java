package AimsProject.src.hust.soict.hedspi.aims.store;
import AimsProject.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Store {

    private ArrayList<Media> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD added to the store: " + dvd.getTitle());
    }

    public void removeMedia(Media dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("DVD removed from the store: " + dvd.getTitle());
        } else {
            System.out.println("DVD not found in the store: " + dvd.getTitle());
        }
    }
}
