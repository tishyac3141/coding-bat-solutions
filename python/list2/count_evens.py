def count_evens(nums):
    #"normal" way:

    #set a counter variable
    numOfEvens = 0

    #loop through the whole list
    for i in range(0, len(nums)):
        #if, when we divide the number at that position by 2, the remainder is 0,
        #then that means the number is even
        if(nums[i] % 2 == 0):
            #increment the counter variable
            numOfEvens = numOfEvens + 1

    return numOfEvens

def count_evens_2(nums):
    #using list comprehension:

    #create a new list with only the elements that are even
    evens = [num for num in nums if num % 2 == 0]
    #return the length of this new list
    return len(evens)

