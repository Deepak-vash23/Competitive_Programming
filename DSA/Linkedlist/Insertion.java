package Linkedlist;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Insertion {

    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Insertion list = new Insertion();

        list.insert(30);
        list.insert(20);
        list.insert(10);
        
        list.display();
        
        list.insert(4);
        list.display();
    }
}