def count_evens(nums):
    #normal way:
    numOfEvens = 0
    for i in range(0, len(nums)):
        if(nums[i] % 2 == 0):
            numOfEvens = numOfEvens + 1

    return numOfEvens

def count_evens_2(nums):
    #using list comprehension:
    evens = [num for num in nums if num % 2 == 0]
    return len(evens)

