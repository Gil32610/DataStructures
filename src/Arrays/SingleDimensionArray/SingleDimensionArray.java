package Arrays.SingleDimensionArray;

public class SingleDimensionArray {
    double[] array = null;


    public SingleDimensionArray(int sizeOfArray) {
        array = new double[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, double value) {
        try {
            if (array[location] == Integer.MIN_VALUE) {
                array[location] = value;
                System.out.println("Inserted at " + location);
            } else System.out.println("Cell at " + location + " is occupied");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot access index " + location + "!");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element at " + i + ": " + array[i]+ " ");
            }
        } catch (Exception e) {
            System.out.println("Cannot traverse null array!");
        }
    }

    public void searchInArray(int value){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                System.out.println("Value found at " + i);
                return;
            }
        }
        System.out.println("Value not found!");
    }


    public void delete (int index){
        try{
            array[index] = Integer.MIN_VALUE;
            System.out.println("Value deleted!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index provided not in array range!");
        }
    }

    public double[] getArray() {
        return array;
    }
}
