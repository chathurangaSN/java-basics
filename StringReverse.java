package algorithms;

public class StringReverse {
    public static void main(String[] args) {
        String str = "remmargorp tsenif eht fo eno si htihcaS";
        String a  = "sachi";
        a = a+"th";
        System.out.println(a);

        System.out.println(StringReverse.method1(str));
        System.out.println(StringReverse.method2(str));
        System.out.println(StringReverse.method3(str));
    }
    public static String method1(String str){
        return new StringBuilder(str)
                .reverse()
                .toString();
    }
    public static String  method2(String str){
//  Everytime this create new string instance
//  so this not efficient way to do that
        String newStr="";
        for(int i=str.length()-1;i>=0;i--){
            newStr =newStr+str.charAt(i);
        }
        return newStr;
    }
    public static String  method3(String str){
//more efficient way than method2
        StringBuilder newStr = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}
