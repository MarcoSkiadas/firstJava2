package org.example;

public class Methoden2205 {
    public static void main(String[] args) {

        int x = 5;
        int y = 4;
        int z = -5;

        System.out.println("add " + x + "+ " + y + "= " + add(x, y));
        System.out.println("\n subtract: " + x + "+ " + y + "= " + subtract(x, y));
        System.out.println("\n Positivenumber: " + z + " =" + makePositive(z));


        if (x > y) {
            System.out.println("\n" + subtract(x, y));
        } else {
            System.out.println("\n" + add(x, y));
        }
        System.out.println("\n" + oddDoubled(3));

        System.out.println("\n"+isPalindrome("anna"));
    }

    public static int add(int x, int y) {

        return x + y;
    }
    //Method Overloading
    public static double add(double x, double y) {

        return x + y;
    }

    public static int subtract(int x, int y) {


        return x - y;
    }

    public static int makePositive(int x) {

        if (x < 0) {

            return x * (-1);
        }
        return x;
    }

    public static int oddDoubled(int z) {

        if (z % 2 == 0) {
            return z;
        } else {
            return z * 2;
        }

    }

    public static boolean isPalindrome(String args) {
        int anfang = 0;
        int ende = args.length() - 1;
        boolean isPalindrome = true;

        for (int i = 0; i < args.length() / 2; i++) {
            if (args.charAt(anfang) != args.charAt(ende)) {
                isPalindrome = false;
            }
            anfang++;
            ende--;
        }
        return isPalindrome;
    }
}