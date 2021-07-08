package java_code.logic2;

//codingbat link: https://codingbat.com/prob/p148972

public class loneSum {

    public int loneSum(int a, int b, int c){
        int finalSum = a + b + c;

        if(a == b && a == c) finalSum = 0;
        else if(a == c) finalSum = finalSum - (a + c);
        else if(a == b) finalSum = finalSum - (a + b);
        else if(c == b) finalSum = finalSum - (c + b);

        return finalSum;
    }
    
}
