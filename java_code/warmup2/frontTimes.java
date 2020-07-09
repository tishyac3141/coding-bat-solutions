package java_code.warmup2;

public class frontTimes {

  public String frontTimes(String str, int n) {
    String newString = "";
    if (str.length() < 3) {
      for (int i = 0; i < n; i++) {
        newString += str.substring(0);
      }
      return newString;
    } else {
      for (int i = 0; i < n; i++) {
        newString += str.substring(0, 3);
      }
      return newString;
    }
  }

}