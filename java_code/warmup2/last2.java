package java_code.warmup2;

//codingbat link: https://codingbat.com/prob/p178318

public class last2 {

    public int last2(String str) {
        if (str.length() < 2)
            return 0;

        String ending = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(ending)) {
                count++;
            }
        }

        return count;
    }
}