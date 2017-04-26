
public class Sortme {

    static int arraySize = 100000;
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
        insertionSort();
        finishTime = System.currentTimeMillis();
        System.out.println("It took " + (finishTime - startTime) + " ms for insertionSort().");

    }

          
    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true; 
        int temp; 

        while (flag) {
            flag = false; 
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) 
                {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true; 
                }
            }
        }
    }

    static void insertionSort() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
