//wap to find max and mean element of an array
//wap print reverse of an array
//2nd largest element of an array 

import java.util.Scanner;
public class Reverse_SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array");
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

        }

        // Find max element
        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);

        // Find mean element
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
         double mean = sum/size;
         System.out.println("Mean of the array is: " + mean);

         //Do the reverse of the array
        // System.out.println("Reverse of the array: ");
        // for (int i = size - 1; i >= 0; i--) {
        //     System.out.print(numbers[i] + " ");
        // }
        // System.out.println();

        int start =0;
        int end = numbers.length-1;
        for(int i=start;i<end;i++){
            int a = numbers[i];
            numbers[start]=numbers[end];
            numbers[end] = a;
            start++;
            end--;
        }
        System.out.println("Reverse of array");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        //2nd largest
        //[0,1,3,2,5]
        int largest = numbers[0];
        int second_largest = numbers[0];

        for (int i = 0; i < size; i++){
            if (numbers[i]>largest){
                second_largest=largest;
                largest=numbers[i];
            }
            else if(numbers[i]>second_largest && numbers[i] != largest){
                second_largest = numbers[i];
            }
        }
        System.out.println("Second Largest: " + second_largest);
sc.close();
}
}