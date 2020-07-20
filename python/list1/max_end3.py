def max_end3(nums):

    if (nums[0] > nums[len(nums) - 1]):
        return nums[0:1] * 3
    else:
        return nums[len(nums) - 1:len(nums)] * 3
