import java.lang.Math;



public class RundomNumberChoser {

  public static void main(String[] args) {

    
    int []Array1 = {1, 3, 4, 5, 8, 9, 12, 16, 19, 29};
    int randomNum = (int)(Math.random() * 54) + 1;
    System.out.println(getRandom(randomNum, Array1));
  } 
  
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
  
}