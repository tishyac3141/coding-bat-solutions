package java_code.string2;

public class prefixAgain {

    public boolean prefixAgain(String str, int n) {

        if (str.length() <= 1)
            return false;

        String newStr = str.substring(0, n);

        int j = 0;
        int before = 0;
        boolean isThere = false;

        for (int i = n; i < str.length(); i++) {
            before = i;
            if (str.charAt(i) == newStr.charAt(j)) {

                while (i < str.length() && j < newStr.length() && str.charAt(i) == newStr.charAt(j)) {
                    i++;
                    j++;
                }
            }

            if (j == newStr.length())
                isThere = true;

            j = 0;
            i = before;
        }

        return isThere;

    }
}