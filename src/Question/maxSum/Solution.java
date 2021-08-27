package Question.maxSum;

import java.util.Arrays;
//arrayin daxilindeki elementlerin maksimum cemini tapmaq

public class Solution {
    public static void main(String[] args) {
        int arr[] = {1,-4,3,-1,1,7,5,-6};
        int arr1[] = {-2,-1,-5,-9};
        System.out.println(arr.length);
        System.out.println(maxSubArray(arr1));
    }
    public static int maxSubArray(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int counter = 0;
        while (counter<nums.length){
            if (nums[counter]>0){
                sum = sum+nums[counter];
            }
            counter++;
        }
        if (sum==0){
            sum = nums[nums.length-1]+nums[nums.length-2];
        }
        return sum;
    }
}
