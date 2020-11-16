package java_code.array3;

public class linearIn {

    public boolean linearIn(int[] outer, int[] inner) {

        int numOfTrue = 0;
        int outerIndex = 0;

        for (int i = 0; i < inner.length; i++) {

            while (outerIndex < outer.length && outer[outerIndex] <= inner[i]) {
                if (outer[outerIndex] == inner[i]) {
                    numOfTrue++;
                    break;
                }
                outerIndex++;
            }
        }

        return numOfTrue == inner.length;

    }

}
