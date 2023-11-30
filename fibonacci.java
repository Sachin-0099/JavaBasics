package JavaBasics;

public class fibonacci {
    public static void main(String args []){
        int a=0;
        int b=1;
        int temp;
        int count=0;
        System.out.println(a);
        System.out.println(b);
        
        for(int i=2;i<10;i++){
            temp=a+b;
            System.out.println(temp);
            a=b;
            b=temp;
           
          
        }
    }
}
