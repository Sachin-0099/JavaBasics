package JavaBasics;
import java.util.*;
public class pattern6 {
    public static void main(String arga []){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n");
    int n=sc.nextInt();
    int i=1;
       int start=1;
    while(i<=4){
        int j=1;
    
        while(j<=i){
            System.out.print(start);
        start++;
            j++;
          
        }
        System.out.println();
           
        i++;
   
    }
}
}