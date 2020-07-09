def makeChocolate(small, big, goal):
    weight = 0

    for i in range(big):
        weight += 5

    while (weight > goal):
        weight -= 5

    if (weight == goal): return 0

    for j in range(small + 1):
        weight += 1
        if (weight == goal): return j

    return -1


print(makeChocolate(6, 2, 7))