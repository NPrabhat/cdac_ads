package day_04;


class Node{
    Node prev;
    int data;
    Node next;
}

public class DoublyLinkedListDemo {
    Node head;
    void addFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        
        if(head == null){
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        else{
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;
        
        if(head == null){
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
        }
    }
    
    void delete(int val){
        if(head == null){
            return;
        }
        
        Node temp=head;
        while(temp!= null && temp.data !=val){
            temp=temp.next;
        }
        if(head.next == null){//No node 
            System.out.println("Data not found");
        }
        else if(temp==head){//for head
            head = head.next;
            head.prev = null;
        }
        else if(temp.next == null){ //for last node
            temp.prev = null;
        }
        else{
           temp.prev.next = temp.next;
           temp.next.prev = temp.prev;
        }
    }
    
    boolean search(int val){
        Node temp = head;
        while(temp ==null){
            if(temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
            
    void printDLL(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        DoublyLinkedListDemo dlld = new DoublyLinkedListDemo();
        dlld.addFirst(100);
        dlld.addFirst(200);
        dlld.addFirst(300);
        
        dlld.printDLL();
        
    }
}
