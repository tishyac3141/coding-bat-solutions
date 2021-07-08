package java_code.logic2;

//codingbat link: https://codingbat.com/prob/p186753

public class roundSum{

    public static int roundSum(int a, int b, int c){
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num){
        int number = num;

        while(number > 10){
            number = number%10;
        }

        if(number >= 5){
            return num + (10 - number);
        } else {
            return num - number;
        }

    }

    public static void main(String[] args){
        System.out.println(roundSum(16, 17, 18)); //expected output: 60
        System.out.println(roundSum(12, 13, 14)); //expected output: 30
        System.out.println(roundSum(6, 4, 4)); //expected output: 10
    }

}