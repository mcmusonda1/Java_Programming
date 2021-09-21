package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int iNum = 25;
        double cVAL = 9.4;
        boolean bVal = true;
        // write your code here

        System.out.println("This is an interger: " + iNum);
        System.out.println("This is an double: " + cVAL);
        System.out.println("This is an boolean: "  + bVal);

        //Strings
        String str1 = "Hello ";
        String str2 = "World";
        System.out.println(str1 + str2);

        //Display the length
        System.out.println("Length: " + str1.length());

        //Display a substring
        System.out.println("Substring: " + str2.substring(0,2));

        //Comparing two strings
        System.out.println(str1.compareTo(str2));

        //Equal the string
        System.out.println(str1.equals(str2));

        //Scanner
        Scanner in =  new Scanner(System.in);

        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;
        int longVal;
        float floatVal;
        double doubleVal;

        System.out.println("Enter boolean Value: ");
        boolVal = in.nextBoolean();

        System.out.println("Enter byte Value: ");
        byteVal = in.nextByte();
        System.out.println("Enter char Value: ");
        charVal = in.next().charAt(0);
        System.out.println("Enter short Value: ");
        shortVal = in.nextShort();
        System.out.println("Enter int Value: ");
        longVal = in.nextInt();


        //Output
        System.out.println("Boolean value: " + boolVal);

        System.out.println("byte Value: " + byteVal);
        System.out.println("char Value: " + charVal);
        System.out.println("short Value: " + shortVal);
        System.out.println("int Value: " + longVal);
    }
}
