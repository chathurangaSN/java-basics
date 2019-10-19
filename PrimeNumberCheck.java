package algorithms;

public class PrimeNumberCheck{

    public boolean isPrimeNumber(int number){

        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String a[]){
        PrimeNumberCheck pc = new PrimeNumberCheck();
        System.out.println(pc.isPrimeNumber(20));
    }
}
