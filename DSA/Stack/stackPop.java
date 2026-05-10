//wap for pop/deletion op 
package Stack;

import java.util.Scanner;

public class stackPop {
    public static void main(String[] args) {
        int[] stack = new int[5];
        Scanner sc = new Scanner(System.in);

        int top=-1;
        //input
         for(int i=0; i<stack.length;i++){
            int num = sc.nextInt();

            top+=1;
            stack[top]=num;
        }

        //stack 
        for(int i=0;i<stack.length;i++){
            System.out.println("Stack is "+ stack[i] + " ");
        }

        //Top index
        System.out.println("top is: "+top);



        if(top==-1){
            System.out.println("Stack Underflow");
        } else{
        for(int i=stack.length-1;i>=0;i--){
            int num = stack[top];

            top-=1;

            System.out.println(num);
        }
    }

    }
}
