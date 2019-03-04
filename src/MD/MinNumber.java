package MD;

import java.util.Scanner;

public class MinNumber {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int[] tab= getInt(4);
        System.out.println("Smallest value is "+findSmallest(tab));

    }

    private static int[] getInt(int number){
        int[] tab= new int[number];
        for(int i=0; i<tab.length; i++){

            System.out.print("Enter "+(i+1)+" number: ");
            tab[i]= scanner.nextInt();
        }
        System.out.println();
        return tab;
    }

    private static int findSmallest(int[] tab){
        int min= Integer.MAX_VALUE;
        for(int i=0; i<tab.length; i++){
            if(tab[i]<min){
                min= tab[i];
            }
        }
        return min;
    }
}
