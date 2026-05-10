package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={3,4,2,1};

        int n= arr.length;
        for(int i=0; i<n;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }

        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
