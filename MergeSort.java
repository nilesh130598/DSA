package DSA;

public class MergeSort {
   public static void main(String[] args) {
	int arr[] = {1,4,3,7,5,6,2,10};
	int low = 0;
	int high = arr.length-1;
	MergeSort.MS(arr, low, high);
	System.out.println(arr);
}
   
  public static void MS(int arr[], int l, int h){
	   while(l<h){
		   int mid = (l+h)/2;
		   MS(arr, l, mid);
		   MS(arr, mid+1, h);
		   merge(arr,l,mid,h);
	   }
   }
  public static void merge(int arr[],int low, int mid, int high){
	  int n1 = mid - low + 1;
      int n2 = high - mid;
      int L[] = new int[n1];
      int R[] = new int[n2];
      for (int i = 0; i < n1; ++i)
          L[i] = arr[low + i];
      for (int j = 0; j < n2; ++j)
          R[j] = arr[mid + 1 + j];
      
      int i = 0, j = 0;
      
      // Initial index of merged subarray array
      int k = low;
      while (i < n1 && j < n2) {
          if (L[i] <= R[j]) {
              arr[k] = L[i];
              i++;
          }
          else {
              arr[k] = R[j];
              j++;
          }
          k++;
      }
      while (i < n1) {
          arr[k] = L[i];
          i++;
          k++;
      }

      /* Copy remaining elements of R[] if any */
      while (j < n2) {
          arr[k] = R[j];
          j++;
          k++;
      }
  }
}
