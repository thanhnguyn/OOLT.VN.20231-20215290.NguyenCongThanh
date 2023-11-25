package OtherProjects.Lab01;

import java.util.Scanner;

public class DisplayDaysofMonth {
    public static void main(String[] args) {

        int[] a;
        int c;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter year: ");
        int y = keyboard.nextInt();
        System.out.println("Enter month: ");
        int m = keyboard.nextInt();

        if (y%4 == 0 && y%100 != 0)
        {
            c =1;

        }
        else if(y%400 ==0)
        {
            c=1;
        }
        else
        {
            c=0;
        }
        switch (c)
        {
            case 0:
                int[] numbers = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                System.out.println(numbers[m-1]);
                break;
            case 1:
                int[] numbers2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                System.out.println(numbers2[m-1]);
                break;
            default:
        }
    }
}
