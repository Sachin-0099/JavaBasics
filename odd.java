package JavaBasics;

public class odd {
    public static void main(String args []){
    int n=4;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print((2*j+1+2*i)%n*1);
        }
        System.out.println();
    }


    }
}
