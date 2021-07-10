import java.util.*;

class Main {
  static int getMin(int arr[], int n) {
     int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
  }
  static int getMax(int arr[], int n) {
     int res = arr[0];
         
      for (int i = 1; i < n; i++)
           res = Math.max(res, arr[i]);
        return res;
  }
  public static void main(String[] args) {
    int arr[] = { 12, 1234, 45, 67 };
    int n = arr.length;

    System.out.println("Smallest element in a array is " + getMin(arr, n));
    System.out.println("Largest element in a array is " + getMax(arr, n));
  }
}