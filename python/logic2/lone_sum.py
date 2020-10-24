#codingbat link: https://codingbat.com/prob/p143951

def lone_sum(a, b, c):
    if(a == b):
        if(c == a):
            return 0
        else:
            return c
    elif(b == c):
        if(a == c):
            return 0
        else:
            return a
    elif(a == c):
        if(b == a):
            return 0
        else:
            return b
    else:
        return a + b + c
