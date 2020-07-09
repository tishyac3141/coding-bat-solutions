package java_code.string3;

public class gHappy {

    public boolean gHappy(String str) {
        boolean isHappy = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {

                if (i == 0) {
                    if (str.length() == 1 || str.charAt(i + 1) != 'g')
                        isHappy = false;
                } else if (i == str.length() - 1) {
                    if (str.charAt(i - 1) != 'g')
                        isHappy = false;
                } else if (str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g') {
                    isHappy = false;
                }

            }
        }

        return isHappy;

    }
}