package algorithms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
	int a[]= {14,33,1,5};
	
	for (int i = 0; i < a.length - 1; i++)  
    {  
        int min_idx = i;  
        
        for (int j = i + 1; j < a.length; j++){  
            
        	if (a[j] < a[min_idx]){  
                min_idx = j; 
            }  
        	
        }  
        int temp = a[min_idx];   
        a[min_idx] = a[i];  
        a[i] = temp; 
    }  

	System.out.println("Sorted array: "+ Arrays.toString(a));
}
}
