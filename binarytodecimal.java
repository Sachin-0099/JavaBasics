package JavaBasics;
import java.util.Scanner;
public class binarytodecimal {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
    int dec=0;
    int pow=0;
   
    while(n>0){
         int ld=n%10;
dec=dec+(ld*(int)Math.pow(2,pow));
pow++;
n/=10;
    }
    System.out.println(dec);
}
}
