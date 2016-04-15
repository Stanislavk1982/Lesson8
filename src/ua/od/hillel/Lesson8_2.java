package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by Стивен on 15.04.2016.
 */
public class Lesson8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of full word: ");
        String string = scanner.nextLine();
        String[] array_string = string.split(" ");
        String[] shortArrayString = new String[array_string.length];

        for (int i = 0; i < array_string.length; i++) {
            shortArrayString[i] = shortForm(array_string[i]);
        }
        Utils.Print_array(shortArrayString);
    }

    public static String shortForm(String fullWord) {
        String shortWord;
        int numberOfCharacters = fullWord.length();
        if (numberOfCharacters > 4) {
            shortWord = String.valueOf(fullWord.charAt(0) + String.valueOf(numberOfCharacters - 2) + String.valueOf(fullWord.charAt(numberOfCharacters - 1)));
        } else shortWord = fullWord;

        return shortWord;
    }
}
