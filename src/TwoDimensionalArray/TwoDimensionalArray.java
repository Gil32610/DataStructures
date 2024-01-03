package TwoDimensionalArray;

public class TwoDimensionalArray {
    private int array[][];

    public TwoDimensionalArray(int rows, int columns) {
        this.array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int rowIndex, int columnIndex, int value) {
        try {
            if (array[rowIndex][columnIndex] == Integer.MIN_VALUE) {
                array[rowIndex][columnIndex] = value;
                System.out.printf("%d was inserted at %d row and %d column%n", value, rowIndex, columnIndex);
            } else System.out.println("Cell already occupied");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot access index");
        }
    }

    public void accessCell(int rowIndex, int columnIndex) {
        System.out.printf("Accessing row #%d and column #%d%n", rowIndex, columnIndex);
        try {
            System.out.println("Cell value is: " + array[rowIndex][columnIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot access index");
        }
    }

    public void traverse() {
        //Takes O(mn) total time complexity
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void searchValue(int value){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] == value) {
                    System.out.printf("Value %d located at row %d column %d%n",value,i,j);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }
    public void deleteValue(int rowIndex, int columIndex){
    try{
        System.out.println("Deleting " + array[rowIndex][columIndex]+ " from row# " + rowIndex + " column# " + columIndex);
        array[rowIndex][columIndex] = Integer.MIN_VALUE;
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Cannot access index");
    }
    }

    public int[][] getArray() {
        return array;
    }
}
