
package algorithms;
import java.util.Scanner;
public class NthFibonacci {
    static int a;
    static int fibonacci(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n =scan.nextInt();
        System.out.println(NthFibonacci.fibonacci(n));
    }
}
