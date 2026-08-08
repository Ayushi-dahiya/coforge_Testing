package com.edtech.my_edtech_product;
import java.util.Scanner;
import java.io.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BasicJavaPrograms {
public static void main(String[] args){
        
    	//input an integer using scanner 
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);
        sc.close();
        
       //input using Console
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available");
            return;
        }

        String s1 = console.readLine("Enter a string: ");
        System.out.println("You entered string " + s1);
        
        //input using buffered reader
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));

            String s="";
			try {
				s = r.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
            System.out.println(s);
    
    }
}
