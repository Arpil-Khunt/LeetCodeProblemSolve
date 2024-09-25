import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,6,10,1,-1,9,8};
        System.out.println(secondLargetstElement(arr));
    }
    static int secondLargetstElement(int[] arr){
        Arrays.sort(arr);
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){

            if(arr[i]>=firstMax){
                if(secondMax < firstMax){
                    secondMax = firstMax;
                }
                firstMax=arr[i];

            }
        }
        return  secondMax;
    }
}
