public class SingleNumber {
    public int singleNumber1(int[] nums) {
        int count = 0;
        int theSingleElement = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                theSingleElement = nums[i];
                break;
            } else {
                count = 0;
            }
        }
        return theSingleElement;

    }
}