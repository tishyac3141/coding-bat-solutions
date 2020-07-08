def make_bricks(small, big, goal):

    if (goal <= small): return True

    numSmall = goal % 5  #amount of 1-inch bricks that need to be used
    numBig = goal // 5  #amount of 5-inch bricks that need to be used

    #if the amount of big bricks we have is less than the amount of big bricks we need
    if (big < numBig):
        #num of small bricks we need changes to whatever remains in goal after using all the big bricks
        numSmall = (goal - (big * 5))
        return (small >= numSmall
                )  #we have to have enough small bricks to account for that
    else:
        return (small >= numSmall and big >= numBig)
        #otherwise, make sure that there's enough small and big bricks
