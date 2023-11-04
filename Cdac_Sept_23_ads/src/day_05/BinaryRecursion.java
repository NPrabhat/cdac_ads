package day_05;

import java.util.Scanner;

public class BinaryRecursion {
    public static int fibo(int n){
        if(n<=1)
            return n;
        
        return fibo(n-1)+fibo(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo(a));
        for(int i=0;i<a;i++){
        System.out.print(fibo(i)+ " ");
        }
    }
}
