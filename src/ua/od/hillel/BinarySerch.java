package ua.od.hillel;

/**
 * Created by Стивен on 17.04.2016.
 */
public class BinarySerch {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 8, 12};
        boolean result = search(array, 3, 0, array.length - 1);
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("There is no such an element");
        }
    }

    public static boolean search(int[] array, int value, int min, int max) {
        int mid = (min + max) / 2;

        if (array[mid] == value) {
            int i=1;
            return true;

        }

        if (min >= max) {
            return false;
        }

        if (array[mid] > value) {
            boolean result = search(array, value, min, mid - 1);
            return result;
        } else {
            boolean result = search(array, value, mid + 1, max);
            return result;
        }
    }
}