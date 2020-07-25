package java_code.warmup1;

//codingbat link: https://codingbat.com/prob/p199720

public class startOz {

    public String startOz(String str) {

        if (str.length() < 2)
            return str;

        else if (str.charAt(0) == 'o') {
            if (str.charAt(1) == 'z') {
                return str.substring(0, 2);
            } else {
                return str.substring(0, 1);
            }
        }

        else if (str.charAt(1) == 'z')
            return str.substring(1, 2);

        else
            return "";

    }

}