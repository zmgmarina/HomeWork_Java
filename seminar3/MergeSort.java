package seminar3;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    private static Random random = new Random();
    public static void main(String[] args) {

        int size = 10;
        int[] array = new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10); 
            
        }
        System.out.println("Неотсортированный массив: " + Arrays.toString(array));

        System.out.println("Отсортированный массив: " + Arrays.toString(separatArray(array)));

    }
    public static int[] separatArray(int[] array){
        if (array == null){
            return null;
        } 
        if (array.length < 2) {
            
            return array;
        }

        int leftArray[] = new int[array.length/2];
        System.arraycopy(array, 0, leftArray, 0, array.length/2);
       
        int rightArray[] = new int[array.length-leftArray.length];
        System.arraycopy(array, leftArray.length, rightArray, 0, array.length-leftArray.length);

        separatArray(leftArray);
        separatArray(rightArray);
        mergeArray(array, leftArray,rightArray);
        return array;
    }

    public static void mergeArray(int[] array, int[] leftArray, int[] rightArray) {
        int leftArrayElement = 0;
        int rightArrayElement = 0;
        int len = array.length;

        for (int i = 0; i < len; i++) {
            if (leftArrayElement == leftArray.length){
                array[i] = rightArray[rightArrayElement];
                rightArrayElement++;
            } else if (rightArrayElement == rightArray.length) {
                array[i] = leftArray[leftArrayElement];
                leftArrayElement++;
            } else if (leftArray[leftArrayElement] < rightArray[rightArrayElement]) {
                array[i] = leftArray[leftArrayElement];
                leftArrayElement++;
            } else {
                array[i] = rightArray[rightArrayElement];
                rightArrayElement++;
            }
        }
    }
}