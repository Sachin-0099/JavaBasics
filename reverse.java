package JavaBasics;

public class reverse {
    public static void main(String args []){
        int rev=0;
       int n=1234;
       while(n>0){
        int digit=n%10;
        rev=rev*10+digit;
        n/=10;
       }
       System.out.print(rev);
    }
}
