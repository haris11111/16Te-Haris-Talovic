
import java.util.Arrays;
import java.util.Scanner;

public class Sortme {

    static int arraySize = 10000;
    static int[] oneArray = new int[arraySize];

    static void randomizeArray() {
        for (int i = 0; i < arraySize; i++) {
            oneArray[i] = (int) (Math.random() * arraySize);
        }
    }

    public static void main(String[] args) {

        randomizeArray();

        long startTime = System.currentTimeMillis();
        bubbleSort(oneArray);
        long finishTime = System.currentTimeMillis();

        System.out.println("It took " + (finishTime - startTime) + " ms for bubbleSort().");

        randomizeArray();
        startTime = System.currentTimeMillis();
        insertionSort(oneArray);
        finishTime = System.currentTimeMillis();
        System.out.println("It took " + (finishTime - startTime) + " ms for insertionSort().");

        randomizeArray();
        startTime = System.currentTimeMillis();
        javaSort(oneArray);
        finishTime = System.currentTimeMillis();
        System.out.println("Java took " + (finishTime - startTime) + " ms to sort the array with Arrays.sort().");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int searchFor = in.nextInt();
        in.nextLine();
        in.close();
        if (linearSearch(oneArray, searchFor)) {
            System.out.println(searchFor + " was found!");
        } else {
            System.out.println(searchFor + " was not found!");
        }
    }

    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true; // set flag to true to begin first pass
        int temp; // holding variable

        while (flag) {
            flag = false; // set flag to false awaiting a possible swap
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) // change to > for ascending sort
                {
                    temp = num[j]; // swap elements
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true; // shows a swap occurred
                }
            }
        }
    }

    static void insertionSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            int j;
            for (j = i - 1; j >= 0 && temp < num[j]; j--) {
                num[j + 1] = num[j];
            }
            num[j + 1] = temp;
        }
    }

    static void quickSort() {
// TODO quicksort or copy-paste from teh interwebs. 

    }

    static void javaSort(int[] num) {
        Arrays.sort(num);
    }

    static boolean linearSearch(int[] num, int searchFor) {
        boolean found = false;
        int index = 0;
        while (!found && searchFor < num[index] && index <= num.length) {
            index++;
            if (num[index] == searchFor) {
                found = true;
            }
        }
        System.out.println(index + ":" + num[index]);
        return found;
    }

}
