//given an integer array a, find second largetst element in the array or report that no such element exists

public class secondLargest {
    public static void main(String[] args) {
        int[] A = {4,1,3,5,5,2};
        int n = A.length;
        for(int i=0; i<n;i++){
            for(int j=0; j<n-i-1;j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
                int b= A[n-1];
            }
        }
        System.out.println("Sorted array is:");
        for(int i=0; i<n; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        
    }
}
