package java_code.array2;

public class centeredAverage {

    public int centeredAverage(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            }
            if (nums[i] >= max) {
                max = nums[i];
            }

            sum += nums[i];
        }

        return (sum - min - max) / (nums.length - 2);

    }

}