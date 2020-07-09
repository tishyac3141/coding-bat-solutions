package java_code.warmup1;
//codingbat link: https://codingbat.com/prob/p140449

public class parrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

}