package java_code.logic2;

//codingbat link: https://codingbat.com/prob/p130788

public class luckySum{

    public int luckySum(int a, int b, int c) {
  
        if(a == 13){
          return 0;
        }
        else if(b == 13){
          return a;
        }
        else if(c == 13){
          return a + b;
        }
        else{
          return a + b + c;
        }
        
      }
      

}