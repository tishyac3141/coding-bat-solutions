package java_code.warmup2;

//codingbat link: https://codingbat.com/prob/p194667

public class countXX {
    int countXX(String str) {

        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }

        return count;

    }

}