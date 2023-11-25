package OtherProjects.Lab02.AimsProject;

import AimsProject.src.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        AimsProject.src.hust.soict.hedspi.aims.cart.Cart anOrder = new Cart();

        AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd1 = new AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);

        AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd2 = new AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);

        AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

        anOrder.addDigitalVideoDisc(dvd1,dvd2);

        anOrder.displayCart();

        anOrder.removeDigitalVideoDisc(dvd2);

        anOrder.displayCart();
    }
}
