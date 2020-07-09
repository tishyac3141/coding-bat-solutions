package java_code.warmup2;

public class doubleX {

  boolean doubleX(String str) {
    boolean isFirst = true;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x' && isFirst) {
        isFirst = false;
        if (i < str.length() - 1 && str.charAt(i + 1) == 'x')
          return true;

      }
    }

    return false;

  }

}