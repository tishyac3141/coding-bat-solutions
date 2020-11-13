package java_code.array3;

public class squareUp {

    public int[] squareUp(int n) {
        int[] square = new int[n*n];
        int multiple = 0;
        int highestNum = 0;
        int indexOfHighestNum = 0;
        
        for(int i = 0; i < square.length; i+=n){
          multiple = i / n;
          highestNum = multiple + 1;
          indexOfHighestNum = indexOfHighestNum + (n-1);
          
          for(int j = indexOfHighestNum; j < i + n; j++){
            square[j] = highestNum;
            highestNum--;
          }
          
        }
        
        return square;
      }
    
}
