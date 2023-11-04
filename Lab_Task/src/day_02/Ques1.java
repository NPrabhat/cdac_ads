package day_02;

import java.util.Collections;
import java.util.Stack;

/*
Q1. Write a Java program to take a string as an input and reverse it using Stack
*/

public class Ques1 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push("Hello");
        s1.push("there");
        s1.push("Apple");
        
        
        Collections.sort(s1);
        System.out.println(s1);
                
    }
}
