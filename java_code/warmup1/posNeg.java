package java.warmup1;

public class posNeg {
  public boolean posNeg(int a, int b, boolean negative) {

    if (negative) {
      if (a < 0 && b < 0)
        return true;
      else
        return false;

    } else {
      if (a < 0 && b > 0)
        return true;
      else if (b < 0 && a > 0)
        return true;
      else
        return false;

    }

  }

}