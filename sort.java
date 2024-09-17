  import java.util.Arrays;

public class sort {
    public static void main(String args[]){
        int arr [] = {5,4,2,1,3,0,-4,-4,8,88,-10,7,-6,-5,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
  //MergeSort
    static void mergeSort(int[] arr, int l, int h){
        if(l<h){
            int mid = l+(h-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    //merge in place
    static void merge(int[] arr, int l , int mid, int h){
        int n1 = mid-l+1;
        int n2 = h - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(int i =0; i<n2; i++){
            right[i] = arr[mid+1+i];
        }
        int i =0 , j = 0;
        int k = l;
        while(i<n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        //copy remaining element
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
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
