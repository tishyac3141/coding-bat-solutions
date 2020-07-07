#codingbat link: https://codingbat.com/prob/p100958

def love6(a, b):
  return ((a==6 or b == 6) or (abs(a - b) == 6 or a + b == 6))

  #alternatively:
  if(a == 6 or b == 6): return True
  elif(a + b == 6 or abs(a - b) == 6): return True
  else: return False    