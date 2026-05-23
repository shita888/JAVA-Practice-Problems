public class Merge {
     public static void main(String[] args) {
          int arr[] = {1,2,3};
      int brr[] = {4,5,6};
      int crr[] = new int[arr.length+brr.length];
      
      for(int i=0;i<arr.length;i++){
          crr[i]=arr[i];
      }
      
      for(int i=0;i<brr.length;i++){
          crr[arr.length+i]=brr[i];
      }
      
      System.out.println("Merge Array:");
      for(int i=0;i<crr.length;i++){
          System.out.println(crr[i]);
      }
     }
}
