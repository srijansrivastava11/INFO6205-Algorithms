package com.company;

public class RotateArray {


    public static void main(String[] args) {
	// write your code here
    	 RotateArray rotate = new RotateArray(); 
         int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
         rotate.rotateArray(arr, 2); 
         int n = arr.length;
         rotate.printArray(arr,n ); 
         
    }

    private static void rotateArray(int[] arr, int k){
        k = k % arr.length;

        reverseArray(arr, 0, arr.length -1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
        
    }


    private static void reverseArray(int[] arr, int start, int end){
        if(start < 0 || end < 0 || end <= start || start >= arr.length || end >= arr.length ){
            return;
        }
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
}