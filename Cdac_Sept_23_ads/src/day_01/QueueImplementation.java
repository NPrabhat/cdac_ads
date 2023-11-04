package day_01;


public class QueueImplementation {
    final int SIZE =3;
    int arr[] = new int[SIZE];
    int front =0;
    int rear =0;
    
    public void push(int value){
        if((rear==SIZE-1 && front==0) || rear==front-1){
            System.out.println("Queue is full....");
            return;
        }
        arr[rear]  = value;
        rear++;
    }
    
    public void pop(){
        if(rear == SIZE){
            if(rear == front)
                rear=front=0;
            System.out.println("Queue is Empty");
        }
    }
    
    public static void main(String[] args) {
        QueueImplementation qi = new QueueImplementation();
        qi.push(0);
    }
}
