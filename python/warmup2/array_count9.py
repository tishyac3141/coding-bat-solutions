#codingbat link: https://codingbat.com/prob/p166170


def array_count9(nums):

    count = 0
    for i in range(len(nums)):
        if (nums[i] == 9):
            count = count + 1

    return count
