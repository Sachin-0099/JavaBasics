package JavaBasics;
import java.util.*;
public class dectobin {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
    
    int pow=0;
    int bin=0;
  
    while(n>0){
        int rem=n%2;
        bin=bin+(rem*(int)Math.pow(10,pow));
        pow++;
        n/=2;
    }
    System.out.print(bin);
    }
}
