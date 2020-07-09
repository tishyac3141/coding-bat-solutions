package java_code.ap1;

//codingbat link: https://codingbat.com/prob/p146974   

public class scoresIncreasing {

    public boolean scoresIncreasing(int[] scores) {
        boolean isIncreasing = true;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] > scores[i])
                isIncreasing = false;
        }

        return isIncreasing;
    }

}