package Week_5;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums ={0,1};
        Arrays.sort(nums);                          // Sort array list by ascending

        for(int i=0;i<=nums.length;i++){
            // if the nums not contain i value
            if(i==nums.length || nums[i] !=i){     // i==nums.length -> ArrayIndexOutOfBoundsException
                System.out.println(i);
                break;
            }

        }
    }
}
