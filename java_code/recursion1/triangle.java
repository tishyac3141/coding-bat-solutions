package java_code.recursion1;

public class triangle {

  public int triangle(int rows) {

    if (rows == 0)
      return 0;
    else if (rows == 1)
      return 1;

    return rows + triangle(rows - 1);

  }

}