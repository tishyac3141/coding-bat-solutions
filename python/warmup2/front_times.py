def front_times(str, n):
  
  if(len(str) < 3):
    return n * str 
  else:
    return str[0:3] * n 

print(front_times('hello', 3))