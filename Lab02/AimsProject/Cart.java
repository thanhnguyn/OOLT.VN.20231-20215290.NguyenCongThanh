package Lab02.AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc itemOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("Disc not found in the cart.");
    }

    public double totalCost() {
        double total = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    public void displayCart() {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart items:");
            for (int i = 0; i < qtyOrdered; i++) {
                System.out.println(String.format("%-10s %-30s $%.2f", (i + 1), itemOrdered[i].getTitle(), itemOrdered[i].getCost()));
            }
            System.out.println(String.format("%-40s $%.2f", "Total Cost:", totalCost()));
        }
    }

}
