package ua.od.hillel;

/**
 * Created by Стивен on 16.04.2016.
 */
public class recursion {
    //String binary="";
    public static void main(String[] args) {
        String bynary = factorial(100);
        System.out.println(bynary);
    }

    public static String factorial(int n) {
        if (n == 1 || n == 0) return "1";
        int rez;
        String result = factorial(n/2);
        rez=n%2;
        result=result+String.valueOf(rez);
        //result = result * n;
        return result;
    }
}
