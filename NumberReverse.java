package algorithms;

public class NumberReverse {

    public int reverseNumber(int number){

        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);//add remainder to the reverse
            number = number/10;//number divide by 10
        }
        return reverse;
    }

    public static void main(String a[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(17868));

    }
}
