package JavaBasics;

public class halfdiamondpattern {
    public static void main(String args []){
        int n=3;
        System.out.println("*");
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k);
            }
            System.out.println("*");
            System.out.println();
      
}
for(int i=n-1;i>0;i--){
         System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k);
            }
            System.out.println("*");
            System.out.println();
}
    }
}
