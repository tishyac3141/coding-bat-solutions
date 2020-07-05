package logic1;

//codingbat link: https://codingbat.com/prob/p141061

public class squirrelPlay {

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer) return temp >= 60 && temp <= 100;
        else return temp >= 60 && temp <= 90;
      }
    
}