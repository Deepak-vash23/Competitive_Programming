//Sum of upper and lower diagonal elements of a matrix

public class upper_diagonal {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++) {
                if(i<j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Upper diagonal sum is: "+ sum);

        int sum2 =0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++) {
                if(i>j){
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("Lower diagonal sum is: "+ sum2);
    }
}
