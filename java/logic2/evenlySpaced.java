package java.logic2;

public class evenlySpaced {

  public boolean evenlySpaced(int a, int b, int c) {
    int large;
    int small;
    int medium;
    if (a > b && a > c) {
      large = a;
      if (b < c) {
        small = b;
        medium = c;
      } else {
        small = c;
        medium = b;
      }
    } else if (b > a && b > c) {
      large = b;
      if (a < c) {
        small = a;
        medium = c;
      } else {
        small = c;
        medium = a;
      }
    } else {
      large = c;
      if (a < b) {
        small = a;
        medium = b;
      } else {
        small = b;
        medium = a;
      }
    }

    return Math.abs(small - medium) == large - medium;

  }

}