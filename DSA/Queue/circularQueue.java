package Queue;

//WAP for circular queue

import java.util.Scanner;

public class circularQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] q = new int[5];

        int front = 0;
        int rear = -1;
        int max = q.length;

        //For insertion
        for(int i=0;i<q.length;i++){
            int num = sc.nextInt();
            rear = (rear + 1) % max ;
            q[rear] = num;
        }
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + " ");
        }

        System.out.println();
        //For Deletion
        for(int i=0;i<q.length;i++){
            if(front > rear){
                System.out.println("Queue is empty");
                break;
            }else{
                System.out.println("Deleted :" + q[front]);
                front = (front + 1)% max;
            }
        }
    }
}