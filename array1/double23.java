package array1;

public class double23 {

    public boolean double23(int[] nums) {
  
        if(nums.length == 0 || nums.length == 1) return false;
        else if(nums[0] == 2 && nums[nums.length -  1] == 2) return true;
        else if(nums[0] == 3 && nums[nums.length -  1] == 3) return true;
        else return false;
        
      }
      
    
}