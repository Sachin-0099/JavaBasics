package JavaBasics;

public class trianglenumpattern {
    public static void main(String args []){
        int n=4;
         
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           int count=i;
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
       
            }
             count=i;
             for(int j=2;j<=i;j++){
              
                System.out.print(i+1);
               count+=2;
             }
       

            System.out.println();
              
        }
    }
}

