package JavaBasics;
import java.util.*;
public class prime {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int d=2;
    while(d<=num-1){
        if(num%d==0){
            System.out.println("Not prime");
            return;
        }
        d=d+1;

    }
    System.out.println("Prime");
}
  }
