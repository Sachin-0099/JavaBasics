package JavaBasics;
import java.util.*;
public class sumorproduct {
    public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
System.out.println("Enter the choice");
int ch=sc.nextInt();
int sum=0;
int product=1;
switch (ch) {
    case 1:for(int i=1;i<=n;i++){
         sum+=i;
    }
    System.out.println(sum);
    break;
        
       case 2:for(int i=1;i<=n;i++){
        product*=i;
       }
       System.out.println(product);
       break;
       default:System.out.println(-1);
       break;
}
    }
}

