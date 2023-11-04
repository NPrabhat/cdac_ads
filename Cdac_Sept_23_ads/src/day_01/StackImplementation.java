
package day_01;

class MyStack{
    final int SIZE = 3;
    int arr[] =new int[SIZE];
    int top=-1;
    
    public boolean isEmpty(){
        if(top ==SIZE-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(top == SIZE-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full....");
        }
        else{
            ++top;
            arr[top] = value;
        }   
    }
    
    public void pop(){
        if(isFull()){
            arr[top] = 0;
            --top;       
            System.out.println("Stack is popped");
        }
        else{
            System.out.println("Stack is underflow");
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top]);
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
//        stack.push(10);
//        System.out.println("10 is pushed");
//        stack.push(10);
//        System.out.println("10 is pushed");
//        stack.push(10);
//        System.out.println("10 is pushed");
        stack.pop();
        
    }
}
