package day_05;

public class IndirectRecursion {
    static int i=1;
    static void even(int n){
        if(n>10)
            return;
        System.out.println("Odd : "+n);
        odd(++n);
    }   
    static void odd(int n){
        if(n>10)
            return;
        
        System.out.println("Even : "+n);
        even(++n);
    }
    
    public static void main(String[] args) {
        even(5);
        System.out.println("***********************");
        odd(6);
    }
}
