package java_code.warmup2;

//codingbat link: https://codingbat.com/prob/p142270

public class stringTimes {

    public String stringTimes(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += str;
        }

        return newString;
    }

}