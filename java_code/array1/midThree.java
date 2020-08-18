package java_code.array1;

public class midThree {

    public int[] midThree(int[] nums) {
        int midLen = nums.length / 2;
        int[] newNums = new int[] { nums[midLen - 1], nums[midLen], nums[midLen + 1] };

        return newNums;

    }

}