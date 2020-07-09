package java_code.string3;

public class countYZ {

    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {

                if ((i + 1) >= str.length())
                    count++;
                else if (!(Character.isLetter(str.charAt(i))))
                    count++;
            }
        }

        return count;
    }
}