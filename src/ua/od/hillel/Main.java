package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
       // System.out.println(string);
        string = string.replace("@", "[ at ]");
        string = string.replace(".", "[ dot ]");
        System.out.println("The address after the replacement: "+string);

    }
}
