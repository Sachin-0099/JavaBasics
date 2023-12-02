package JavaBasics;

public class isprime {
    public static boolean isprime(int n){
int d=2;
while(d<n){
    if(n%d==0){
        return false;
     
    }
     d++;
}
  
    return true;


}
    public static void main(String args []){
System.out.println(isprime(14));

    }
}
