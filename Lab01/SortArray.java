package Lab01;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = keyboard.nextInt();
        int[] a = new int[s];
        int swap;
        for (int i=0;i<s;i++)
        {
            a[i] = keyboard.nextInt();
        }
        for (int i=0;i<s;i++)
        {
            for(int j=i;j<s;j++)
            {
                if (a[i]>a[j])
                {
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
                else continue;
            }
        }
        for (int i=0;i<s;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
