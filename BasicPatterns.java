package com.edtech.my_edtech_product;

public class BasicPatterns {
	public static void main(String[] args) {
		//right triangle
        int rows = 5; 
        
        for (int i = 1; i <= rows; i++) {       
            for (int j = 1; j <= i; j++) {     
                System.out.print("* ");
            }
            System.out.println();               
        }
        //pyramid
        rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) + " ");
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((i + j) + " ");
            }

            System.out.println();
        }
    }
}
