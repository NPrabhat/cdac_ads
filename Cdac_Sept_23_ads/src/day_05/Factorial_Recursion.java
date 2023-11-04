package day_05;

import java.util.Scanner;

class RecursionDemo{
    int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}

public class Factorial_Recursion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            RecursionDemo rd = new RecursionDemo();
            int a = sc.nextInt();
            int b =rd.factorial(a);
            System.out.println(b);
    }
}
