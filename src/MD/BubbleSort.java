package MD;

import java.util.Scanner;

public class BubbleSort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how big array do you want to have:");
        int a = scanner.nextInt();
        int[] newTab = getIntegers(a);
        int[] sorted= sortedArray(newTab);
        printArray(sorted);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] sortedArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }

    private static int[] getIntegers(int a) {
        int[] tab = new int[a];
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            tab[i] = scanner.nextInt();
        }
        return tab;
    }
}
