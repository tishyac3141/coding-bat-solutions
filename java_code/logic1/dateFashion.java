package java_code.logic1;

//codingbat link: https://codingbat.com/prob/p103360

public class dateFashion {

  public int dateFashion(int you, int date) {

    if (you <= 2 || date <= 2)
      return 0;
    else if (you >= 8 || date >= 8)
      return 2;
    else
      return 1;

  }

}