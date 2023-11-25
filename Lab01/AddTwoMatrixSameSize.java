package Lab01;

import java.util.Scanner;

public class AddTwoMatrixSameSize {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the size of 2 arrays : ");
        int s = keyboard.nextInt();
        int[] a = new int[s];
        int[] b = new int[s];

        System.out.println("Enter the first array : ");
        for (int i=0;i<s;i++)
        {
            a[i] = keyboard.nextInt();
        }

        System.out.println("Enter the second array : ");
        for (int i=0;i<s;i++)
        {
            b[i] = keyboard.nextInt();
        }

        for (int i=0;i<s;i++)
        {
            a[i] += b[i];
            System.out.println(a[i]);
        }
    }
}
