package AimsProject.src.hust.soict.hedspi.aims.media;
import java.util.List;
import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        CompactDisc cd = new CompactDisc("Messi","Messi","Rodiguez",6.00f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("Ronaldo","Cristiano","Rodrygo",7,8.52f);
        Book book = new Book("Neymar","Junior",5.32f);
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for(Media m: mediae) {
            System.out.println(m.toString());
        }
    }

}