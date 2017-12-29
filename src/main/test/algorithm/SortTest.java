package algorithm;

import java.util.Random;

public class SortTest {
    private static Integer N = 100000;
    private static Integer NUMBER_RANGE = 1000;
    private static int[] array = new int[N];

    public static void main(String[] args){
        arrayInit(array);
        printArray(array);
        int[] tempArray = cpy(array);

        long t1 = System.currentTimeMillis();
        SortUtil.quickSort(array, 0,array.length-1);
        long t2 = System.currentTimeMillis();
        printArray(array);
        printTime("quickSort" ,t1,t2);

        // --
        printArray(tempArray);
        long t3 = System.currentTimeMillis();
        SortUtil.bubboSort(tempArray);
        long t4 = System.currentTimeMillis();
        printArray(tempArray);
        printTime("bubboSort", t3, t4);
    }

    public static void arrayInit(int[] arr){
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(NUMBER_RANGE);
        }
    }

    public static int[] cpy(int[] arr){
        int[] cpy_arr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            cpy_arr[i] = arr[i];
        }
        return cpy_arr;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }

    public static void printArray(int[] arr, int start,int end){
        for(int i=start;i<end+1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }

    public static void printTime(String methodName,long startTime,long endTime){
        System.out.println(methodName+" spend: "+(endTime-startTime)+"ms");
    }
}
