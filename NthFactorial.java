package algorithms;
import java.util.Scanner;
public class NthFactorial {

    static int factorial(int n){
        if(n<=1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =scan.nextInt();
        System.out.println(NthFactorial.factorial(n));
    }
}
