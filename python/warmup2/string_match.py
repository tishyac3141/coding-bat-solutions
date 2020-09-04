#codingbat link: https://codingbat.com/prob/p182414


def string_match(a, b):
    if (len(a) == 0 or len(b) == 0):
        return 0

    count = 0
    if (len(a) < len(b)):
        for i in range(len(a) - 1):
            if (a[i:i + 2] == b[i:i + 2]):
                count += 1

    else:
        for i in range(len(b) - 1):
            if (a[i:i + 2] == b[i:i + 2]):
                count += 1

    return count