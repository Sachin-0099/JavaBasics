package JavaBasics;

public class sumpattern {
   public static void main(String args []){
int n=5;

for(int i=1;i<=n;i++){
   int sum=0;
    for(int j=1;j<=i;j++){
        System.out.print(j);
        sum+=j;
        if(j<i){
            System.out.print("+");
        }
    }
System.out.println("="+sum);
    System.out.println();
}
   } 
}
