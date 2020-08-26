#codingbat link: https://codingbat.com/prob/p145834


def last2(str):

    if (len(str) < 2):
        return 0

    else:
        lastStr = str[len(str) - 2:]
        count = 0
        for i in range(len(str) - 2):
            if (str[i:i + 2] == lastStr):
                count = count + 1

        return count
