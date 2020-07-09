package java_code.logic2;

public class makeChocolate {

  public static void main(String[] args) {
    System.out.println(makeChocolate(4, 1, 5));
  }

  public static int makeChocolate(int small, int big, int goal) {
    int weight = 0;

    for (int i = 0; i < big; i++) {
      weight += 5;
    }

    while (weight > goal) {
      weight -= 5;
    }

    if (weight == goal)
      return 0;

    for (int i = 1; i <= small; i++) {
      weight++;
      if (weight == goal)
        return i;
    }

    return -1;

  }

}