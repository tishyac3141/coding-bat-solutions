package logic2;

public class blackjack {

    public int blackjack(int a, int b) {
        int diff1 = 21 - a;
        int diff2 = 21 - b;
        
        if(diff1 < 0 && diff2 < 0) return 0;
        else if(diff1 < 0) return b;
        else if(diff2 < 0) return a;
        else if(diff1 < diff2) return a;
        else return b;
        
        
      }
      
    
}