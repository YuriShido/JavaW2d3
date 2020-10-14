import java.util.Scanner;
import java.util.Arrays;

public class AvarageAnArray {

  public static void main(String[] args) {
    // int []testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 19, 24, 26, 27, 29};

    Scanner input = new Scanner(System.in);
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
  } 
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
}
