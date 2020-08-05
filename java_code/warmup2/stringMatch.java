package java_code.warmup2;

public class stringMatch {

    public int stringMatch(String a, String b) {

        int length;
        if (a.length() < b.length())
            length = a.length();
        else
            length = b.length();

        int count = 0;

        for (int i = 1; i < length; i++) {
            if (a.charAt(i - 1) == b.charAt(i - 1) && a.charAt(i) == b.charAt(i)) {
                count++;
            }
        }

        return count;
    }

}