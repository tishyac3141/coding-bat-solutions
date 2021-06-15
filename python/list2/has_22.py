def has_22(nums):
    #loop through the given list - BUT be sure that the bounds are 
    #one less than the end of the array since we'll be checking
    #both the element at the index we're at AND the element at 
    #the index after. alternatively, you can start from index 1
    #and check the element we're at the and the element before
    for i in range(0, len(nums) - 1):
        #if the index we're at and the index after are both 2, then 
        #we return True
        if(nums[i] == 2 and nums[i+1] == 2):
            return True
    #if we've exited the loop, that means consecutive 2's have not been found
    #and we can just return false
    return False