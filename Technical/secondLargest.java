//given an integer array a, find second largetst element in the array or report that no such element exists

public class secondLargest {
    public static void main(String[] args) {

        int[] a = {4,1,3,5,5,2};

        if(a.length < 2){
            System.out.println("No second largest element exists");
            return;
        }

        int largest = a[0];
        int second = a[0];;

        for(int i = 0; i < a.length; i++){
            if(a[i] > largest){
                second = largest;
                largest = a[i];
            }
            else if(a[i] > second && a[i] != largest){
                second = a[i];
            }
        }

        if(largest == second)
            System.out.println("No second largest element exists");
        else
            System.out.println("Second largest element is: " + second);
    }
}

