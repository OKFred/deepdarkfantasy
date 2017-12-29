package algorithm;

public class SortUtil {

    public static void bubboSort(int[] arr){
        int temp;
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left >= right){
            return;
        }
        if(left+1 == right){
            if(arr[left]>arr[right]){
                swap(arr, left,right);
            }
            return;
        }
        int base = arr[left];
        int i = left+1;
        int j = right;
        while(true){
            if(arr[i]>base && arr[j]<=base){
                swap(arr , i ,j);
            }
            if(i==j){
                break;
            }
            if(arr[j]>base){
                j--;
            }
            if(i==j){
                break;
            }
            if(arr[i]<=base){
                i++;
            }
            if(i==j){
                break;
            }
        }
        if(arr[i]<base){
            swap(arr, left,i);
        }
        quickSort(arr,left,i-1);
        quickSort(arr,i,right);
    }

    public static void swap(int[] arr, int source, int target){
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }

    public static void mergeSort(){

    }

    public static void divideGroup(){

    }
}
