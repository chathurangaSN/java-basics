package sorting;

public class BubbleSorting {
    
    public static void main(String[] args) {
        int[] arr1 ={1,4,2,7,3,4};
        int n=arr1.length;
        int temp;
        
        for(int i =0;i<n-1;i++){
            
            for(int j=0; j<n-1-i;j++){
                
                if(arr1[j]>arr1[j+1]){
                    
                    temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }

        }
        
        for (int i:arr1
             ) {
            System.out.print(i+", ");
        }
    }

}
