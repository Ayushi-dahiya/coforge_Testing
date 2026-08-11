package com.edtech.my_edtech_product;
import java.io.*;

public class StringPrograms {
	public static void main(String[] args)
    {

        String str = "Hello!I am learning Java";

        int index = 5;

        char ch = str.charAt(index);

        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);
        //replace character
        char ch1 = 'F';

        str = str.substring(0, index) + ch1
              + str.substring(index + 1);

        System.out.println("Modified String = " + str);
        //reverse string
        StringBuilder res = new StringBuilder();

        res.append(str);

        res.reverse();

        System.out.println(res);
    }
}
