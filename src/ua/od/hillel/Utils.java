package ua.od.hillel;

/**
 * Created by Стивен on 15.04.2016.
 */
public class Utils {
    public static void Print_array(String[] args) {
        System.out.println("The string with abbreviated words:");
        for (int i=0; i<args.length; i++)
            System.out.print(" "+args[i]);
    }
}
