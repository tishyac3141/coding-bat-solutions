def double_char(str):
    newStr = ""

    for i in range(len(str)):
        newStr += str[i] + str[i]

    return newStr
