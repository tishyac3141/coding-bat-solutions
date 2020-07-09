package java_code.warmup1;

//codingbat link: https://codingbat.com/prob/p116624

public class diff21 {

    public int diff21(int n) {
        if (n > 21)
            return Math.abs(2 * (n - 21));
        else
            return Math.abs(21 - n);
    }

}