package algorithms;
import java.util.Scanner;
public class NthFactorial {

    static int factorial(int n){
        if(n<=1)
            return 1;
        else
            return n*factorial(n-1);
        
        //above all thing can do in single line by 'Ternary operator'
        //return (n<=1)?1:n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =scan.nextInt();
        System.out.println(NthFactorial.factorial(n));
    }
}
