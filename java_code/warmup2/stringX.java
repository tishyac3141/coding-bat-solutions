package java_code.warmup2;

//codingbat link: https://codingbat.com/prob/p171260

public class stringX {

    public String stringX(String str) {

        if (str.length() <= 1)
            return str;

        String newString = str.substring(0, 1);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                newString += str.substring(i, i + 1);
            }
        }

        newString += str.substring(str.length() - 1);
        return newString;

    }

}