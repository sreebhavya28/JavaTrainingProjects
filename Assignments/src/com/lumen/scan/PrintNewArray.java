package com.lumen.scan;

public class PrintNewArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
        
        for(int i=0;i<arr.length;i++)
        {
      
            arr[i] = arr[i]*arr[i];
        }
        
        System.out.println("New array after finding square of each element :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }    
	}

}

