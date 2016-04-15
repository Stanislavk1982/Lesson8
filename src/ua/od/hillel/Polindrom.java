package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by Стивен on 16.04.2016.
 */
public class Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPalindroms = 0;
        System.out.println("Enter words: ");
        String string = scanner.nextLine();
        System.out.println(string);
        String[] array = string.split(",");
        for (int i = 0; i < array.length; i++) {
            if (palindroms(array[i]))
                numberPalindroms++;
        }
        System.out.println("Palindromes: " + numberPalindroms);
    }

    public static boolean palindroms(String word) {
        word = word.trim();
        int charInWord = word.length();

        int sumChar = charInWord % 2;
        char[] tempword = word.toCharArray();
        String first = "", second = "";
        int charInWordHalf = charInWord / 2;
        first = word.substring(0, charInWordHalf);
        if (sumChar == 1) {
            for (int i = charInWord - 1; i > charInWordHalf; i--) {
                second = second + String.valueOf(tempword[i]);
            }
        } else {
            for (int i = charInWord - 1; i > charInWordHalf - 1; i--) {
                second = second + String.valueOf(tempword[i]);
            }
        }

        if (first.equals(second)) {
            System.out.println("The palindrom: " + word);
            return true;
        } else return false;
    }
}
