package JavaBasics;
import java.util.*;
public class pattern4 {
    public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n");
int n=sc.nextInt();
int i=1;
while(i<=n){
    int j=4;
    while(j>=1){
        System.out.print(j);
        j--;
    }
    System.out.println();
    i++;
}
    }
}
