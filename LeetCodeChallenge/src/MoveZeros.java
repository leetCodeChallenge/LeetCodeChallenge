public class MoveZeros {
    public int[] moveZeros(int[] nums){
        int count = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length){
            nums[count++] = 0;
        }
        nums.toString();

        return nums;
    }
}
