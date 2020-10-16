import java.lang.Math;
import java.util.Scanner;

public class JavaW2D3assignment {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ***** problem1 ******//
    int []testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 19, 24, 26, 27, 29};
    System.out.println("target found at index " + Binarysearch(testArray, 12));

    // ****** problem2 *******//
    int []Array1 = {1, 3, 4, 5, 8, 9, 12, 16, 19, 29};
    int randomNum = (int)(Math.random() * 54) + 1;
    System.out.println("Your add random number is " + getRandom(randomNum, Array1));

    // ***** problem3 ******* //
    double[] inputArray = new double[10];
    int count = 1;
    System.out.println("Please enter 10 double number value");
    for(int i = 0; i < 10; i++) {
      System.out.println("No." + count);

      double numbers = input.nextDouble();
      inputArray[i] = numbers;
      count++;
    }
    System.out.println("Your avarage number is " + (average(inputArray)));

    // ****** problem4 ******* //
    double[] minArray = new double[10];
    int counter = 1;
     System.out.println("Please enter 10 number value");
    for(int i = 0; i < 10; i++) {
      System.out.println("No." + counter);

      double numbers = input.nextDouble();
      minArray[i] = numbers;
      counter++;
    } 
    System.out.println("The smallest number is " + (min(minArray)));


  }

  //*****  problem1  ********/
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

  // ***** problem2 ******* //
  public static int getRandom(int num, int arr[]) {
    int x = 0;
    
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == num) {
        x++;

      } else if(arr[i] != num) {
        x = num;
      }
    } return num;
      
  }

  // ***** problem3 ******* //
  public static int average(int[] arr) {
    int sum = 0;
    int result = 0;
    for(int i = 0; i < arr.length; i++) {
      sum = sum + arr[i]; 
    } result = sum / arr.length;
    return result;
  }
  public static double average(double[] arr) {
    double result = 0;
    double sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    } result = sum / arr.length;
    return result;
  } 

  // ****** problem4 ******* //
  public static double min (double[] array) {
    double temp;
    
    for(int i = 0; i < array.length; i++) {
      for(int j = i+1; j < array.length; j++) {
        if(array[i] > array[j]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;

        }
      }
    }
    return array[0];
  }

}


