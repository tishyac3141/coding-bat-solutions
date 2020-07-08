package java.array2;

public class isEverywhere {

  public boolean isEverywhere(int[] nums, int val) {
    boolean isEverywhere = true;

    for (int i = 0; i < nums.length - 1; i++) {
      if (!(nums[i] == val || nums[i + 1] == val)) {
        isEverywhere = false;
      }
    }

    return isEverywhere;

  }

}