  import java.util.Arrays;

public class sort {
    public static void main(String args[]){
        int arr [] = {5,4,2,1,3,0,-4,-4,8,88,-10,7,-6,-5,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for(int i =0; i<arr.length; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int minIdx = i;
            int min = arr[i];
            for(int j = i+1; j<arr.length; j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIdx = j;
                }
            }
            if(i != minIdx){
                arr[minIdx] = arr[i];
                arr[i] = min;
            }
        }
    }

    //insertion sort
    static void insertionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
