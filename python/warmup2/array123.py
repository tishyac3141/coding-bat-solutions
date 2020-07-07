def array123(nums):
  is123 = False
  for i in range(1, len(nums) - 1):
    if(nums[i-1] == 1 and nums[i] == 2 and nums[i + 1] == 3):
      is123 = True
  
  return is123