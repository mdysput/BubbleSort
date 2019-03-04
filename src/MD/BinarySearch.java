package MD;

public class BinarySearch {
    public static void main(String[] args) {
        int[] tab= {1, 2, 3, 4, 5, 6, 7};
        int liczba= binary(tab, 564);
        if(liczba>-1){
            System.out.println("number was found on position: "+(liczba+1));
        }
    }

    private static int binary (int[] tab, int searched) {
        int first = 0;
        int last = tab.length;
        try {
            while (first <= last) {
                int middle = (first + last) / 2;
                if (tab[middle] == searched) {
                    return middle;
                } else if (searched < tab[middle]) {
                    last = middle - 1;
                } else
                    first = middle + 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("cant find that number");
        }
        return -1;

    }

}
