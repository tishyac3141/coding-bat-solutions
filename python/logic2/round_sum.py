#codingbat link: https://codingbat.com/prob/p179960

def round_sum(a, b, c):
    return round10(a) + round10(b) + round10(c)
  
  
def round10(num):
    digit = 0
    newNum = num
    if(newNum // 10 == 0): 
        digit = newNum

    while(newNum // 10 != 0):
        if(newNum // 10 == 0):
            break
        else:
            digit = newNum % 10
            newNum = newNum // 10
    
    if(digit >= 5):
        return num + (10 - digit)
    else:
        return num - digit

print(round_sum(6, 4, 4))