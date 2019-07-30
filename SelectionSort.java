package algorithms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
	int a[]= {14,33,1,5};
	
	for (int i = 0; i < a.length - 1; i++)  
    {  
        int index = i;  
        
        for (int j = i + 1; j < a.length; j++){  
            
        	if (a[j] < a[index]){  
                index = j;//lowest index  
            }  
        	
        }  
        int temp = a[index];   
        a[index] = a[i];  
        a[i] = temp; 
    }  

	System.out.println("Sorted array: "+ Arrays.toString(a));
}
}
