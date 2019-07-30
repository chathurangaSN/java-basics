package algorithms;
    public class Swap {

        public static void main(String[] args) {
            int num1=17,num2=62;
            System.out.println("before swap\t num1: "+num1+"\tnum2: "+num2);
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
            System.out.println("After swap\t num1: "+num1+"\tnum2: "+num2);
        }

    }
