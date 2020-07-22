def sum13(nums):
    sum = 0
    was13 = False
    for i in nums:

        if (i == 13):
            was13 = True
            continue
        else:
            if (was13):
                was13 = False
                continue
            else:
                was13 = False
                sum += i

    return sum