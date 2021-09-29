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

        // Scanner input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade: ");

        //input
        int grade = scan.nextInt();
        System.out.println("Your grade is: ");

        //Conditional statement

        if (grade >= 0 && grade <= 49) {
            System.out.println("F");
        } else if  ( grade >= 50 && grade <= 55) {
            System.out.println("D");
        } else if (grade >= 56 && grade <= 60) {
            System.out.println("D+");
        } else if (grade >= 61 && grade <= 65) {
            System.out.println("C");
        } else if (grade >= 66 && grade <= 70) {
            System.out.println("C+");
        } else if (grade >= 71 && grade <= 75) {
            System.out.println("B");
        } else if (grade >= 76 && grade <= 80) {
            System.out.println("B+");
        } else if (grade >= 81 && grade <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid input");
        }
        //Switch statement
        Scanner pc = new Scanner(System.in);
        System.out.println("When is the next world cup? ");

        int year = pc.nextInt();
        System.out.println("Have you gotten it correct? ");
        switch (year) {
            case 2021 -> System.out.println("Almost correct");
            case 2022 -> System.out.println("Yes you are correct, prepare to attend it.");
            default -> System.out.println("Recheck on your calender");
        }

        ///Enhanced for loop
        String array[] = {"Musonda", "Leonard", "Networking"};

        for (String x:array)
        {
            System.out.println(x);
        }

        //for loop

        Scanner fo = new Scanner(System.in);
        System.out.println("Enter a number less than 10 to increment by 2 using for loop: ");

        for (int number = fo.nextInt(); number <= 10; number = number +2)
        {
            System.out.println(number);
        }

        //While loops
        Scanner wh = new Scanner(System.in);
        System.out.println("Enter number less than 10 to increment by 1 using a do while loop: ");

        int val = wh.nextInt();
        do {
            System.out.println(val);
            val++;
        }
        while (val < 10);



    }
}
