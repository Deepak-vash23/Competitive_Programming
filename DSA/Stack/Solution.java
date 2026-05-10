package Stack;

public class Solution {
    public static void main(String arg[]) {
        String A1 = "((())";
        int len = A1.length();
        char[] stack = new char[len];
        int top = -1;

        for (int i = 0; i < len; i++) {
            char ch = A1.charAt(i);

            if (ch == '(') {
                stack[++top] = ch;
            } else if (ch == ')') {
                if (top == -1) {
                    System.out.println("0");
                    return;
                }
                top--;
            }
        }

        if (top == -1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
