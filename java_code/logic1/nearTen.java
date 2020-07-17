package java_code.logic1;

public class nearTen {

    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}