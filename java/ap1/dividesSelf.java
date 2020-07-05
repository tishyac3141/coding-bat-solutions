package ap1;

import java.util.ArrayList;

public class dividesSelf {
    
    public boolean dividesSelf(int n) {
  
        ArrayList<Integer> digitsOfNum = new ArrayList<Integer>();
            boolean isSelf = true;
    
            if(n % 10 == 0) return false;
    
            int remainder = n % 10;
            int newNumber = n;
    
            while(newNumber != 0){
                remainder = newNumber % 10;
                
                digitsOfNum.add(remainder);
    
                newNumber = (int)(newNumber / 10);
                
                
            }
    
            int toDivideBy;
            for(int i = 0; i < digitsOfNum.size(); i++){
                toDivideBy = digitsOfNum.get(i);
                if(n % toDivideBy != 0) isSelf = false;
            }
         
            return isSelf;
      
    }
    

}