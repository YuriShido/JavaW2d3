import java.util.Scanner;

public class FindTheSmallest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] inputArray = new double[10];
    int count = 1;
     System.out.println("Please enter 10 number value");
    for(int i = 0; i < 10; i++) {
      System.out.println("No." + count);

      double numbers = input.nextDouble();
      inputArray[i] = numbers;
      count++;
    } 
    System.out.println("The smallest number is " + (min(inputArray)));
  }

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
