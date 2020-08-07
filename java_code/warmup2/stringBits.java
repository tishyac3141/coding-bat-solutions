package java_code.warmup2;

public class stringBits {

    public String stringBits(String str) {

        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                newString += str.substring(i, i + 1);
            }
        }

        return newString;
    }

}