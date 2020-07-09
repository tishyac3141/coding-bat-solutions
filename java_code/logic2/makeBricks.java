package java_code.logic2;

//codingbat link: https://codingbat.com/prob/p183562
//supplementary: https://codingbat.com/doc/practice/makebricks-introduction.html

public class makeBricks {

    public boolean makeBricks(int small, int big, int goal) {

        if (goal <= small)
            return true;

        int numSmall = goal % 5; // amount of 1-inch bricks that need to be used
        int numBig = goal / 5; // amount of 5-inch bricks that need to be used

        // if the amount of big bricks we have is less than the amount of big bricks we
        // need
        if (big < numBig) {
            // num of small bricks we need changes to whatever remains in goal after using
            // all the big bricks
            numSmall = (goal - (big * 5));
            return (small >= numSmall); // we have to have enough small bricks to account for that
        } else {
            return (small >= numSmall && big >= numBig);
            // otherwise, make sure that there's enough small and big bricks
        }
    }
}