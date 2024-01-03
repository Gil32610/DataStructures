package Arrays.TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] int2DArray;
        int2DArray = new int[2][2];
        for (int i = 0; i < int2DArray.length; i++) {
            for (int j = 0; j < int2DArray[0].length ; j++) {
                int2DArray[i][j] = 5;//Takes O(mn) time complexity
            }
        }
        System.out.println(Arrays.deepToString(int2DArray));
    //All together
        String s2DArray[][] = { {"Lisa Lisa", "Zeppelli"},{"SpeedWagon","JoeStar"}}; //Takes O(1) time complexity
        System.out.println(Arrays.deepToString(s2DArray));

        TwoDimensionalArray tda = new TwoDimensionalArray(5,5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tda.insertValue(i,j,j);
            }
        }
        System.out.println(Arrays.deepToString(tda.getArray()));

        tda.accessCell(4,4);

        tda.traverse();

        tda.searchValue(4);

        tda.deleteValue(3,2);

        tda.traverse();
    }
}
