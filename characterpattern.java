package JavaBasics;
import java.util.*;
public class characterpattern {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
        int j=1;
          char ch='A';
        while(j<=n){
           
            System.out.print(ch);
             ch++;
            j++;
            
        }
        System.out.println();
        i++;
    }
}
}
