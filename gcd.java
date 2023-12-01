package JavaBasics;
import java.util.Scanner;
public class gcd {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Enter y");
        int y=sc.nextInt();
        if(x==y){
            System.out.println(x);
        }else if(x>y){
            System.out.println(x-y);

        }else{
            System.out.println(y-x);
        }
    }
    
}
