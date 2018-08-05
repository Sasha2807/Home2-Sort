import java.util.Arrays;

/**
 * Created by aleksandrap on 7/8/2018
 */
public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {2, 1, 4, 8, 7, 5, 6, 3, 6, 9};
        System.out.println(Arrays.toString(unsortedArray));
        //bubbleSort(unsortedArray);

        insertSort(unsortedArray);

    }


    public static void bubbleSort(int[] arrayToSort) {

        int changeCounter;

        do {
            changeCounter = 0;
            for (int index = 0; index < arrayToSort.length-1; index++) {

           if (arrayToSort[index] > arrayToSort[index + 1]) {
                 int temp = arrayToSort[index];
                 arrayToSort[index] = arrayToSort[index + 1];
                 arrayToSort[index + 1] = temp;
                 changeCounter++;
                 }
            }

        }

        while (changeCounter >0);

        System.out.println(Arrays.toString(arrayToSort));


    }

    public static void insertSort(int[] arrayToSort) {


        int element;
        int indexToInsert;

        for (int index = 0; index < arrayToSort.length; index++) {

            element = arrayToSort[index];

            indexToInsert = index;

            while (indexToInsert > 0
                    && arrayToSort[indexToInsert -1] > element) {
                arrayToSort[indexToInsert] = arrayToSort[indexToInsert - 1];
                indexToInsert--;
                arrayToSort[indexToInsert] = element;
            }
        }

        System.out.println(Arrays.toString(arrayToSort));

    }

}


