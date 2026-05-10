//Implementing Stack operations.

package Stack;

import java.util.Stack;

public class stackOperations {
    public static void main(String[] args) {
        Stack stack= new Stack<>();

        int element = 15;
        int element2 = 10;
        int element3 = 1;
        int element4 = 40;

        //Push op
        stack.push(element);
        stack.push(element2);
        stack.push(element3);
        stack.push(element4);

        System.out.println(stack);
        
        //Pop op

        stack.pop();

        //Checking if empty or not
        stack.isEmpty();
        System.out.println(stack);
        
    }
}
