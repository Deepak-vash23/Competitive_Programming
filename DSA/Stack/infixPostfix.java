package Stack;
import java.util.Scanner;
import java.util.Stack;

public class infixPostfix {

    static Scanner sc = new Scanner(System.in);
    static int top = -1;
    static String input = sc.nextLine();
    static String output = "";
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) {
        System.out.println(logic(input));
    }

    public static int precedence(char ch){
        if (ch == '+' || ch == '-') return 1;
        if (ch == '/' || ch == '*') return 2;
        if(ch == '^') return 3;

        return 0;
    }

    public static String logic(String s){
        output = "";
        stack.clear();
        stack.push('(');
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                continue;
            }
            if(ch=='('){
                stack.push(ch);
            }

            else if((ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <='z') || (ch >= '0' && ch <= '9')){
                output=output+ch;
            }
            else if(ch==')'){
                while(stack.peek()!='('){
                    output=output+stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else{
                 while(!stack.isEmpty() && stack.peek() != '(' && precedence(stack.peek()) >= precedence(ch)){
                    output = output + stack.peek();
                    stack.pop();
                 }

                 stack.push(ch);
            }
        }

        while (stack.peek()!='(') {
            output=output+stack.peek();
            stack.pop();
        }
        stack.pop();
        return output;
    }
}
