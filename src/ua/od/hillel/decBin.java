package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by Стивен on 16.04.2016.
 */
public class decBin {
    //String binary="";
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String bynary = bynary(number);
        System.out.println(bynary);
    }

    public static String bynary(int n) {
        if (n == 1) return "1";
        int rez;
        String result = bynary(n / 2);
        result = result + String.valueOf(n % 2);
        return result;
    }
}
