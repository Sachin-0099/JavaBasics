package JavaBasics;
import java.util.*;
public class squareroot {
    public static void main(String args []){

   
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int sqr=0;
    while(sqr*sqr<=n){
        sqr++;
    }
    sqr=sqr-1;
    System.out.println(sqr);
    }
}
