package java_code.string1;

public class left2 {

  public String left2(String str) {

    if (str.length() <= 2)
      return str;
    else
      return str.substring(2) + str.substring(0, 2);

  }
}