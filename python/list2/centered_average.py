def centered_average(nums):

    #find the first occurences of the minimum and maximum values in the list
    minIndex = nums.index(min(nums))
    maxIndex = nums.index(max(nums))

    #make a new list without the maximum and minimum
    newList = [
        nums[i] for i in range(len(nums)) if i != minIndex and i != maxIndex
    ]

    #not necessary, but an extra check to make sure the length is not 0
    if len(newList) == 0: return 0

    #return the average
    return sum(newList) // len(newList)
