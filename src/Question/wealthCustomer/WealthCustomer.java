package Question.wealthCustomer;

public class WealthCustomer {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,10,9},{2,6,3}};
        System.out.println(say(arr));
    }


    public static int say(int[][] arr){
        int sum = 0;
        int checkerNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j <arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (checkerNumber> sum){
                i++;
            }else if (checkerNumber == sum){
                checkerNumber = sum;
            }else {
                checkerNumber = sum;
            }
        }
        return checkerNumber;
    }

}
