//given an array arr, check if there exists a pair(i,j) such that arr[i] +arr[j] ==k
//note: i and j are indexes and k is the given sum 

public class pair_addition {
    public static void main(String[] args) {
        int[] arr = {10,12,15,0,9,8};
        int k = 17;
        boolean found = false;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == k) {
                    found = true;
                    System.out.println("Yes");
                }
            }        
        }
        if(!found) {
            System.out.println("No");
        }
    }
}