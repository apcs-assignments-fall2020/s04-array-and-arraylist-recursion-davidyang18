// David Yang
// 2/9/2021
// Worked with Koyo Asakawa on "HasCountCopies" method
import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (i == list.size() - 1) {
            return true;
        }
        else if (list.get(i) > (list.get(i + 1))) {
            return false;
        }
        else {
            return isSortedRec(list , i + 1);
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if (i == arr.length && count == 0) {
            return true;
        }
        else if (i == arr.length && count != 0) {
            return false;
        }
        else if (arr[i] == x) {
            return hasCountCopiesRec(arr, x, count - 1, i + 1);
        }
        else {
            return hasCountCopiesRec(arr, x, count, i + 1);
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length - 1, 0);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound, int middleIndex) {    
        while (lowerBound <= upperBound) {
            middleIndex = lowerBound + (upperBound - lowerBound) / 2;
 
            if (arr[middleIndex] > num) {
                return binarySearchRec(arr, num, lowerBound, middleIndex - 1, middleIndex);
            }
            else if (arr[middleIndex] < num) {
                return binarySearchRec(arr, num, middleIndex + 1, upperBound, middleIndex);
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
