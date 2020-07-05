# codingbat link: https://codingbat.com/prob/p192962

def reverse3(nums):
  newList = []
  for i in range(len(nums) - 1, -1, -1):
    newList.append(nums[i])
  
  return newList