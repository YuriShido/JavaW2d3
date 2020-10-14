
import java.util.Arrays;

 public class binarySearch {

  public static void main(String[] args) {

    int []testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 19, 24, 26, 27, 29};

    System.out.println("target found at index " + Binarysearch(testArray, 12));
  }

  public static int Binarysearch(int arr[], int target) {
    
    int first = 0;
    int last = arr.length - 1;
    // int step = 0;
    int index = 0;
    // System.out.println(first);
    while (first <= last) {
      int middle =(first + last) / 2;
      // step += 1;

      if (target == arr[middle]) {        
        index = middle;
        break;

      } else if (target > arr[middle]) {
        first = middle + 1;

      } else if (target < arr[middle]) {
        last = middle - 1;

      }
    }
    return index;
  }
}
// target + "found at index " + middle + "after " + step +" steps."