package Stack;
import java.util.Scanner;

public class stackInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[5];

        int top =-1;

        for(int i=0; i<stack.length;i++){
            int num = sc.nextInt();

            top+=1;
            stack[top]=num;
        }

        for(int i=0;i<stack.length;i++){
            System.out.println(stack[i] + " ");
        }
    }
}