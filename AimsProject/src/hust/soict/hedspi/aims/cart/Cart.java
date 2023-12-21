package AimsProject.src.hust.soict.hedspi.aims.cart;

import AimsProject.src.hust.soict.hedspi.aims.exception.NonExistingItemException;
import AimsProject.src.hust.soict.hedspi.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.naming.LimitExceededException;


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private ObservableList<Media> viewFilter;

    public void addMedia(Media media) throws LimitExceededException {
        if (this.itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            if (this.itemsOrdered.contains(media)) {
                System.out.println("The media existed in the list");
            } else {
                this.itemsOrdered.add(media);
                System.out.println("The media is added");
            }
        } else {
            throw new LimitExceededException("ERROR: The number of media has reached its limit");
        }
    }

    public void removeMedia(Media medium) throws NonExistingItemException {
        if (this.itemsOrdered.remove(medium)) {
            System.out.println(medium.getTitle() + " has been removed from the cart.");
        } else {
            throw new NonExistingItemException(medium.getTitle() + " is not in the cart.");
        }
    }

    public float totalCost() {
        float cost = 0.0f;
        for (Media medium : itemsOrdered) {
            cost += medium.getCost();
        }
        return cost;
    }

    public void print() {
        System.out.println("\n***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            System.out.println(Integer.toString(i + 1) + "." + "\t" + this.itemsOrdered.get(i).getDetails() + "\n");
        }
        System.out.println("Total cost: " + "$" + this.totalCost());
        System.out.println("***************************************************");
        System.out.println("\n");
    }

    public boolean filterMedia(int id) {
        boolean found = false;
        int qty = 0;
        float cost = 0f;
        System.out.println("\n******************SEARCH RESULT********************");
        System.out.println("Product ID: " + id);
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            if (this.itemsOrdered.get(i).getId() == id) {
                System.out.println(Integer.toString(i + 1) + "." + "\t" + this.itemsOrdered.get(i).getDetails() + "\n");
                qty += 1;
                cost = this.itemsOrdered.get(i).getCost();
                found = true;
            }
        }
        if (found) {
            System.out.println("Total number of product " + id + " found: " + qty);
            System.out.println("Total cost for these product: " + "$" + (cost * qty));
            System.out.println("***************************************************");
            System.out.println("\n");
            return true;
        } else {
            System.out.println("Such product is not in the cart");
            System.out.println("***************************************************");
            System.out.println("\n");
            return false;
        }
    }

    public boolean filterMedia(String title) {
        boolean found = false;
        int qty = 0;
        float cost = 0f;
        System.out.println("\n******************SEARCH RESULT********************");
        System.out.println("Product title: " + title);
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            if (this.itemsOrdered.get(i).search(title)) {
                System.out.println(Integer.toString(i + 1) + "." + "\t" + this.itemsOrdered.get(i).getDetails() + "\n");
                qty += 1;
                cost = this.itemsOrdered.get(i).getCost();
                found = true;
            }
        }
        if (found) {
            System.out.println("Total number of product " + title + " found: " + qty);
            System.out.println("Total cost for these product: " + "$" + (cost * qty));
            System.out.println("***************************************************");
            System.out.println("\n");
            return true;
        } else {
            System.out.println("Such product is not in the cart");
            System.out.println("***************************************************");
            System.out.println("\n");
            return false;
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
        return this.itemsOrdered;
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