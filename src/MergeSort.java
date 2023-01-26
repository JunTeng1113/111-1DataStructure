import java.io.*;
public class MergeSort {

   static void merge(char[] data, int start, int mid, int end) {
      int left = start;
      int right = mid + 1;
      int i;
      
      char[] finalData = new char[end - start + 1];
      
      for (i = 0; i < (end - start + 1); i++) {
         if (left > mid) {
            finalData[i] = data[right];
            right++;
         } else if (right > end) {
            finalData[i] = data[left];
            left++;
         } else if (data[left] <= data[right]) {
            finalData[i] = data[left];
            left++;
         } else {
            finalData[i] = data[right];
            right++;
         }
      }
      
      for (i = 0; i < (end - start + 1); i++) {
         data[start + i] = finalData[i];
      }
      System.out.print(start + "-" + mid + "-" + end);
      System.out.println(":[" + new String(finalData) + "]");
   }
   
   static void mergeSort(char[] data,int start,int end) {
      int mid;
      if ( end <= start ) return;
      mid = (start + end) / 2;
      mergeSort(data, start, mid);
      mergeSort(data, mid + 1, end);
      merge(data, start, mid, end);
   }
   
   public static void main(String[] args) throws Exception {
      String str;
      int len;
      
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Input String: ");
      System.out.flush();
      str = input.readLine();
      input.close();
      len = str.length();
      char[] data = new char[len];
      data = str.toCharArray();
      mergeSort(data, 0, len - 1);
      
      System.out.println("Sorted String: " + new String(data));
   }
}