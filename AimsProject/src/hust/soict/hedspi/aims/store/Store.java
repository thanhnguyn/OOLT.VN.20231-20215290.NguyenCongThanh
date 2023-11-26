package AimsProject.src.hust.soict.hedspi.aims.store;
import AimsProject.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD added to the store: " + dvd.getTitle());
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("DVD removed from the store: " + dvd.getTitle());
        } else {
            System.out.println("DVD not found in the store: " + dvd.getTitle());
        }
    }
}
