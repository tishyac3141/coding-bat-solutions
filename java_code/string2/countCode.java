package java_code.string2;

public class countCode {

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }

}