package logic1;

//codingbat link: https://codingbat.com/prob/p159531

public class cigarParty {
    
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend) return cigars >= 40;
        else return cigars >= 40 && cigars <= 60;
      }
      
}