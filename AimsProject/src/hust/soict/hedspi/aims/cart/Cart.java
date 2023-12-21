package AimsProject.src.hust.soict.hedspi.aims.cart;

import AimsProject.src.hust.soict.hedspi.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private ObservableList<Media> viewFilter;

    private int qtyOrdered = 0;
    public void addMedia(Media disc) {
        if(qtyOrdered == 20) {
            System.out.println("The cart is full, "
                    + "please remove previous discs to add!");
            return ;
        }
        if(qtyOrdered > 15) {
            System.out.println("The cart is almost full!");
        }

        itemsOrdered.add(disc);
        qtyOrdered += 1;
        System.out.println("The disc has been added!");
    }
    public void addMedia(Media [] dvdList) {
//		for(int i=0; i< dvdList.length; i++) {
//			addDigitalVideoDisc(dvdList[i]);
//		}
        for (Media disc: dvdList) {
            addMedia(disc);
        }
    }
    public void addMedia(Media dvd1,Media dvd2) {
        addMedia(dvd1);
        addMedia(dvd2);
    }

    public void removeMedia (Media disc) {
        try {
            itemsOrdered.remove(disc);
            qtyOrdered -= 1;
            System.out.println("The disc is removed!");
        }
        catch (Exception e) {
            System.out.println("Disc has not been added yet!");
            return ;
        }
    }
    public float totalCost() {
        float total = 0;
        for(int i= 0; i< itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }
    public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < this.qtyOrdered; i++ ) {
            System.out.println(i+1 + ". " + itemsOrdered.get(i));
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("**************************************************");
    }
    public void searchId(int id) {
        for(Media item: itemsOrdered) {
            if(item.getId() == id) {
                System.out.println(item);
                return ;
            }
            System.out.println("No DVD is matched!");
        }
    }
    public void searchTitle(String title) {
        for(Media item: itemsOrdered) {
            if(item.isMatch(title)) {
                System.out.println(item);
                return ;
            }
            System.out.println("No DVD is matched!");
        }
    }
    public Media searchMedia(String title) {
        for (Media medium : this.itemsOrdered) {
            if (medium.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return medium;
            }
        }
        return null;
    }

    public void sortByTitle() {
        FXCollections.sort(this.itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        FXCollections.sort(this.itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public int getSize() {
        return this.itemsOrdered.size();
    }
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public ObservableList<Media> filterId(String str) {
        viewFilter = FXCollections.observableArrayList();
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            if (str.length() > String.valueOf(this.itemsOrdered.get(i).getId()).length()) {
                continue;
            } else if (String.valueOf(this.itemsOrdered.get(i).getId()).substring(0, str.length()).equals(str)) {
                viewFilter.add(this.itemsOrdered.get(i));
            }
        }
        return viewFilter;
    }
    public ObservableList<Media> filterTitle(String str) {
        viewFilter = FXCollections.observableArrayList();
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            if (str.length() > String.valueOf(this.itemsOrdered.get(i).getTitle()).length()) {
                continue;
            } else if (this.itemsOrdered.get(i).getTitle().substring(0, str.length()).equals(str)) {
                viewFilter.add(this.itemsOrdered.get(i));
            }
        }
        return viewFilter;
    }


    public void empty() {
        this.itemsOrdered.clear();
    }
}