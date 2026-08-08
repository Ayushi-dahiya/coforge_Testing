package com.java.greeks;

public class greeks {

    public static void main(String[] args) {

        // Question 6 - Display All Prime Numbers from 1 to N

        int n = 50;

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int i = 2; i <= n; i++) {

            boolean prime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        // Question 7 - Check Leap Year

        int year = 2024;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }


        // Question 8 - Armstrong Numbers Between Two Integers

        int start = 1;
        int end = 500;

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {

            int temp = i;
            int digits = 0;
            int count = i;

            // Count digits
            while (count != 0) {
                digits++;
                count = count / 10;
            }

            int sum = 0;
            temp = i;

            // Calculate Armstrong value
            while (temp != 0) {

                int digit = temp % 10;

                sum = sum + (int) Math.pow(digit, digits);

                temp = temp / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        // Question 9 - Check Neon Number

        int number = 9;

        int square = number * number;
        int sum = 0;
        int temp = square;

        while (temp != 0) {

            int digit = temp % 10;

            sum = sum + digit;

            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Neon Number");
        } else {
            System.out.println(number + " is not a Neon Number");
        }


        // Question 10 - Check Vowel or Consonant

        char ch = 'e';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            System.out.println(ch + " is a Vowel");

        } else {
            System.out.println(ch + " is a Consonant");
        }

    }
}
