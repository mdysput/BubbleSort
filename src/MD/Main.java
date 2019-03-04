package MD;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how big array do you want to have:");
        int a= scanner.nextInt();
        int[] newTab= getIntegers(a);
        sortedArray(newTab);
        printArray(newTab);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] sortedArray(int[] array) {
        boolean flag = true;
        int temp;
        while (flag) {
            for (int i = 0; i < array.length - 1; i++) {
                flag = false;
                if (array[i] > array[i + 1]) {
                   temp= array[i];
                   array[i]= array[i+1];
                   array[i+1]= temp;
                }
            }
        }
        return array;
    }

    private static int[] getIntegers(int a){
        int[] tab= new int[a];
        for(int i=0; i<tab.length; i++){
            System.out.print("Enter "+(i+1)+" number: ");
            tab[i]= scanner.nextInt();
        }
        return tab;
    }
}
