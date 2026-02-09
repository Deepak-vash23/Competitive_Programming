//count the no of elements that are less than max no
//[10,12,15,0,9,8]
//Observation in steps

public class count_element {
    public static void main(String[] args) {
        int[] arr = {10,12,15,0,9,8};

        //Step1. Iterate and find max element.
        int max=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element is: "+ max);
        
        //Step2. Iterate and count no. of element that are not equal to max.
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(max != arr[i]){
                count = count + 1;
            }
        }

        System.out.println("the no of elements that are less than max no"+count);
}
}