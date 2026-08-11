package com.edtech.my_edtech_product;

public class BasicMathJavaPrograms {
	 static String addBinary(String x, String y) {

	        int num1 = Integer.parseInt(x, 2);
	        int num2 = Integer.parseInt(y, 2);

	        int sum = num1 + num2;
	        return Integer.toBinaryString(sum);
	    }
	public static void main(String[] args){
        
    	//Swap numbers    
		int m = 9, n = 5;
        System.out.println("Before swapping: m = " + m + ", n = " + n);

        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping: m = " + m + ", n = " + n);
        //add binary
        String x = "011011";
        String y = "1010111";
        System.out.println(addBinary(x, y));
        //LCM of 2 numbers
        int a = 15, b = 25;

        int ans = (a > b) ? a : b;

        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        System.out.println("LCM of " + a + " and " + b
                           + " : " + ans);
        
    }
}
