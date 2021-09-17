import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //This is the unsorted array
        int[] unsorted = new int[] {2,1,4,3};
        System.out.println(Arrays.toString(unsorted));

        //This is the array sorted in ascending order
        int[] sorted2 = InsertionSort(unsorted);
        System.out.println(Arrays.toString(sorted2));

        //This is the array sorted in descending order
        int[] descending = reverse(sorted2);
        System.out.println(Arrays.toString(descending));
    }

    //this is for insertion sort
    public static int[] InsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int pos = i;
            while(pos > 0 && k < arr[pos-1]) {
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = k;
        }
        return arr;
    }

    //this is for reversing the sorted array
    public static int[] reverse(int[] arr) {
        int j = arr.length-1;
        int x = arr.length/2;
        for (int i = 0; i < x; i++) {
            int temp = arr[i];
            arr[i] = arr[j - i];
            arr[j - i] = temp;
        }
        return arr;
    }

}
