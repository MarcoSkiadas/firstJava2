package org.example;

class HelloWorld2105 {

    public static void main(String[] args) {

        System.out.println("Java is cool\n");

        int a = 2;
        int b = 1;

        int sum = a + b;

        System.out.println("Sum: "+sum);

        float c = 3;
        float d = 4;

        System.out.println("\n\nSum2: "+(c+ d));
        System.out.println("Diff: "+(c- d));
        System.out.println("prod: "+(c* d));
        System.out.println("quotient: "+(c/ d));

        boolean greaterThan =  c> d;
        boolean lessThan =  c< d;
        boolean equality =  c== d;

        System.out.println(greaterThan + " " + lessThan + " " + equality);
        System.out.println("Wooohooo, i was also here");

    }
}
