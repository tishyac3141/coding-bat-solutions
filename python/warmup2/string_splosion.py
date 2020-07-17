def string_splosion(str):
    newStr = ""
    for i in range(len(str)):
        newStr += str[:i + 1]

    return newStr
