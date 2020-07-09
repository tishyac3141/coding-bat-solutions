package java_code.string1;

public class extraEnd {

  public String extraEnd(String str) {
    String newString = "";

    for (int i = 0; i < 3; i++) {
      newString += str.substring(str.length() - 2);
    }

    return newString;
  }

}