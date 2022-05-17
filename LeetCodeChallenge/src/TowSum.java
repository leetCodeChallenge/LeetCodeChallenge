import java.util.Arrays;

public class TowSum {
    public int[] twoSum(int[] nums, int target){

        int start = 0;
        int end = 1;
        while (start < nums.length-1){
            if (nums[start] + nums[end] == target){
                return new int[]{start,end};
            } else if (end == nums.length-1) {
                start++;
                end = start+1;
            } else end++;
        }
        return new int[]{0};
//        int[] result = {0};
//        for (int i = 0; i < nums.length; i++){
//            for (int j=i+1; j < nums.length; j++){
//                if (nums[i] + nums[j] == target && nums[i] != nums[j]){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return result;
    }

}
