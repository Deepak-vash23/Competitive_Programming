package Sorting;
public class insertionSort {
    public static void main(String[] args) {
        int[] arr={5,1,6,2,4,3};
        int n= arr.length;
        for(int i=1;i<=n-1;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key <arr[j]){
                arr[j+1] = arr[j];
                j=j-1;
                System.out.println(arr[j+1]);
            }
            arr[j+1]=key;
        }
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
