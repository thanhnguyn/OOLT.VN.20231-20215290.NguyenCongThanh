package OtherProjects.Lab02.AimsProject;

import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc jungleDVD = new AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc("JungLe");
        AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc cinderellaDVD = new AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc("Cinderella");

        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
