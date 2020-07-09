package java_code.array1;

public class no23 {

  public boolean no23(int[] nums) {
    boolean isNotThere = true;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2 || nums[i] == 3)
        isNotThere = false;
    }

    return isNotThere;

  }

}