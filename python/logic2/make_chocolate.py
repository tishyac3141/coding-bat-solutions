def make_chocolate(small, big, goal):

    amtBigNeeded = goal // 5

    if (amtBigNeeded >= big):
        goal = goal - 5 * big
    else:
        goal = goal - 5 * amtBigNeeded

    if (small < goal):
        return -1
    else:
        return small - (small - goal)
