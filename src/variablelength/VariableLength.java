package variablelength;

import javax.swing.plaf.SliderUI;
import java.util.Arrays;

public class VariableLength {
    public static void main(String[] args) {
        printMax(34, 3, 4, 6, 89);
        printMax(new int[] {1, 2, 3});

        //int[] list = {1, 2, 3, 4, 5, 6, 7};
        //int k = linearSearch(list,4);
       // System.out.println(k);

        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 10};
        int l = binarySearch(myList, 4);
        System.out.println(l);


        int[] theList =  {4, 3, 5, 2, 1, 6};
        java.util.Arrays.sort(theList);
         
        java.util.Arrays.parallelSort(theList);
        System.out.println(Arrays.binarySearch(theList, 2));

        System.out.println(Arrays.toString(theList));

       // selectionSort(theList);
       // System.out.println(Arrays.toString(theList));
    }

    private static void printMax( int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        for (int i = 0; i < numbers.length ; i++)
            if (numbers[i]> result)
                result = numbers[i];
        System.out.println("The max value is " + result);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[]list, int key) {
        int high = list.length-1;
        int low = list[0];


       while (high >= 0){
           int mid = (low + high) / 2;
           if (key < list[mid])
               high = mid -1;
           else if (key == list[mid])
               return mid;
           else
               low = mid + 1;

           }
       return -low - 1;

    }

    public static void selectionSort(int[] theList) {
        /*for (int i = 0; i < theList.length - 1; i++) {
            int currentMin = theList[i];

            int currentMinIndex = i;


           for (int j = i + 1; j < theList.length ; j++) {
                   if (currentMin > theList[j]) {
                       currentMin = theList[j];
                       currentMinIndex = j;

                   }


            }

           if (currentMinIndex != i){
                theList[currentMinIndex] = theList[i];
                theList[i] = currentMin;
            }
        }*/

    }
}


