package array2;

public class fizzBuzz{

    public String[] fizzBuzz(int start, int end){

        String[] array = new String[end - start];
        int counter = start;

        for(int i = 0; i < array.length; i++){

            if(counter % 3 == 0 && counter % 5 == 0){
                array[i] = "FizzBuzz";
                counter++;
            }
            else if(counter % 3 == 0){
                array[i] = "Fizz";
                counter++;
            }
            else if(counter % 5 == 0){
                array[i] = "Buzz";
                counter++;
            }
            else{
                array[i] = String.valueOf(counter);
                counter++;
            }
        }

        return array;
    }
    
}