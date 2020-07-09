package java_code.array1;

//codingbat link: https://codingbat.com/prob/p118976

public class sameFirstLast {

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

}