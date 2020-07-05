# codingbat solution:
def make_out_word(out, word):
  return out[:2] + word + out[2:]

# extra code to incorporate user input

str1 = input("What would you like to encompass your word in? It has to be only 4 characters long: ")
str2 = input("What word would you like to encompass?: ")

print(make_out_word(str1, str2))