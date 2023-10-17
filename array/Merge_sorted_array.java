class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=m-1;int j=n-1;int k=m+n-1;
      while(i>=0&& j>=0){
          if (nums1[i]>nums2[j]){
              nums1[k]=nums1[i];
              i--;
              k--;
          }
          else{
              nums1[k]=nums2[j];
              j--;
              k--;
          }
      }
      while(i>=0)
      nums1[k--]=nums1[i--];
      while(j>=0)
      nums1[k--]=nums2[j--];  
    }
}
/*


import java.util.*;

public class tUf {

    public static void merge(long[] arr1, long[] arr2, int n, int m) {

        // Declare a 3rd array and 2 pointers:
        long[] arr3 = new long[n + m];
        int left = 0;
        int right = 0;
        int index = 0;

        // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:

        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            } else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }

        // If right pointer reaches the end:
        while (left < n) {
            arr3[index++] = arr1[left++];
        }

        // If left pointer reaches the end:
        while (right < m) {
            arr3[index++] = arr2[right++];
        }

        // Fill back the elements from arr3[]
        // to arr1[] and arr2[]:
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i - n] = arr3[i];
            }
        }
    }

    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

}
*/
