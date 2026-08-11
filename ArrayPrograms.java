package com.edtech.my_edtech_product;
import java.util.Arrays;

public class ArrayPrograms {
	private static boolean isElementPresent(int[] arr, int key) {
        for (int element : arr) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    	//search element 
        int[] arr = {3, 5, 7, 2, 6, 10};
        int key = 7;

        boolean res = isElementPresent(arr, key);
        System.out.println("Is " + key + " present in the array: " + res);
        //sort array
        int[] arr1 = {2, -1, 3, 4};


        Arrays.sort(arr1); 

        System.out.println(Arrays.toString(arr1)); 
    }
    
}
