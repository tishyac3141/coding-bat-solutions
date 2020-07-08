package java.ap1;

//link: https://codingbat.com/prob/p134174

public class copyEvens {

    public int[] copyEvens(int[] nums, int count) {
        int[] newArray = new int[count];

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && counter < count) {
                newArray[counter] = nums[i];
                counter++;
            }
        }

        return newArray;
    }

}