package java.string2;

//codingbat link: https://codingbat.com/prob/p165312

public class doubleChar {

    public String doubleChar(String str) {
        String doubleString = "";

        for (int i = 0; i < str.length(); i++) {
            doubleString += str.charAt(i);
            doubleString += str.charAt(i);
        }

        return doubleString;
    }

}