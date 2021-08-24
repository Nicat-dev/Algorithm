package Question.removeDuplicate;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        length = removeDuplicate(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }

    public static int removeDuplicate(int arr[], int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        int[] temp = new int[number];
        int j = 0;
        for (int i = 0; i < number - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[number - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
}
