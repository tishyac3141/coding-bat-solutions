# extra line to incorporate user input; not part of actual solution
n = int(input("type in any number"))

def diff21(n):
  if n > 21:
    return 2*abs(21-n)
  else:
    return abs(21 - n)
# extra line to incorporate user input; not part of actual solution
print(diff21(n))