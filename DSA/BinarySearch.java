//apply binary search on an array

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {6, 7, 12, 14}; 
        int k = 12;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }   
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
