package java_code.logic2;

public class noTeenSum {
  public int noTeenSum(int a, int b, int c) {
    int sum = 0;

    if (a >= 13 && a <= 19)
      sum += fixTeen(a);
    else
      sum += a;

    if (b >= 13 && b <= 19)
      sum += fixTeen(b);
    else
      sum += b;

    if (c >= 13 && c <= 19)
      sum += fixTeen(c);
    else
      sum += c;

    return sum;

  }

  public int fixTeen(int n) {
    if (n == 15) {
      return 15;
    } else if (n == 16) {
      return 16;
    } else
      return 0;
  }
}