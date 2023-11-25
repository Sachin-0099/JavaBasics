package JavaBasics;
import java.util.*;
public class sum {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your num");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            sum=sum+i;
            i=i+1;
        }
        System.out.println("The sum of n no.is"+sum);
    }
}
