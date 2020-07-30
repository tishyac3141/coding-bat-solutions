package java_code.string2;

public class repeatFront {

    public String repeatFront(String str, int n) {

        String newString = "";
        for (int i = n; i >= 0; i--) {
            newString += str.substring(0, i);
        }

        return newString;

    }
}