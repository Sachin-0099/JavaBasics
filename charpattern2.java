package JavaBasics;
import java.util.*;
public class charpattern2 {
    public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n");
int n=sc.nextInt();
int i=1;

while(i<=n){
    int j=1;
   char startingchar=(char)('A'+i-1);
    while(j<=n){
       
        System.out.print(startingchar);
             startingchar=(char)(startingchar+1);
        j++;
     
    }
    System.out.println();
 
    i++;
}
    }
}
