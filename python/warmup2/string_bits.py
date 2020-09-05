#codingbat link: https://codingbat.com/prob/p113152

def string_bits(str):
    listOfChars = [str[i] for i in range(len(str)) if(i % 2 == 0)]
    newStr = ""
    return newStr.join(listOfChars)