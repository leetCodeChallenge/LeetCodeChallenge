public class SumClosest {
    public int sumClosest(int[] nums , int target){
        int size = nums.length;
        if(size < 3){
            return 0;
        }

        int result = nums[0] + nums[1] + nums[2];
        int sumValue = Math.abs(target - result);
        if (target - result == 0){
            return result;
        }
        for (int i = 1; i<size -2; i++){


            int sum = nums[i] + nums[i+1] + nums[i+2];
            int df = Math.abs(target -sum);
            if (target > 0){
                if (Math.abs(target - result) > df){
                    result = sum;
                }
            }else {
                if (result - target  > df){
                    result = sum;
                }
            }

        }
        return result;
    }
}
