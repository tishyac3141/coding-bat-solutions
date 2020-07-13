def not_string(str):

    if ('not' in str):
        if (str[0:3] == 'not'):
            return str
        else:
            return 'not ' + str
    else:
        return 'not ' + str
