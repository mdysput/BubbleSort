package MD;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int[] tab= getIntegers(5);
        System.out.println(Arrays.toString( reverseArray(tab)));

    }


    private static int[] getIntegers(int a){
        int[] tab= new int[a];
        for(int i=0; i<tab.length; i++){
            tab[i]= scanner.nextInt();
        }
        return tab;
    }

    private static int[] reverseArray(int[] tab){
        int[] reverseTab= Arrays.copyOf(tab, tab.length);
        int mid= reverseTab.length/2;
        int max= reverseTab.length-1;
        int temp;

        for(int i=0; i<mid; i++){
            temp= reverseTab[i];
            reverseTab[i]= reverseTab[max-i];
            reverseTab[max-i]= temp;
        }
        return reverseTab;
    }
}
