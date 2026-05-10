//WAP to find factorial of a number using function    
//WAP to find addition of two number using function 
//WAP to print X^m using function

public class Function {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int addition(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static double exponential(double base, double power){
        double result = Math.pow(base, power);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 3 is: "+ factorial(3));
        System.out.println("Exponential of 3 with power of 2 is: " + exponential(3, 2));
        System.out.println("Addition of 123 and 7635 is: " + addition(123, 7635));
    }
}
