package java_code.logic2;

public class makeChocolate {

  public static void main(String[] args) {
    System.out.println(makeChocolate(4, 1, 4));
  }

  public static int makeChocolate(int small, int big, int goal) {
    int bigKilos = 0;
    int bigBarsUsed = 0;

    while (bigKilos <= goal && bigBarsUsed <= big) {
      bigBarsUsed++;
      bigKilos += 5;
    }

    bigKilos -= 5;

    if (bigKilos == goal)
      return 0;
    else {
      if (goal - bigKilos <= small) {
        return goal - bigKilos;
      } else {
        return -1;
      }
    }

  }

}