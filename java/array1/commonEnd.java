package java.array1;

//codingbat link: https://codingbat.com/prob/p191991

public class commonEnd {

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

}