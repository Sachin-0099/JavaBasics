package JavaBasics;
import java.util.Scanner;
public class ncr {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
        num=num*i;
        }
        int den=1;
        for(int i=1;i<=r;i++){
            den=den*i;
        }
        int den2=1;
        for(int i=1;i<=n-r;i++){
            den2=den2*i;
        }
        int ans=num/(den*den2);
        System.out.println(ans);

    }
}
