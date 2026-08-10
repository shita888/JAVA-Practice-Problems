package BinarySearch;

public class BS {
    public static void main(String[] args) {
        // int arr[] = {-1,0,3,4,5,9,12};
        int arr[] = {1, 3, 5, 7, 9, 11, 13};
        // int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int arr[] = {1, 2, 2, 2, 3};

        int t = 6;
        int result = -1;
        int mid = (0+arr.length)/2;
        // System.out.println("mid: "+mid);
        
        for(int i=0;i<=mid;i++){
            if(t == arr[mid]){
                // System.out.println("yes: "+mid);
                result = mid;   
                break;
            } 
            else if(t > arr[mid])
                {
                    mid = (mid+arr.length)/2;
                    // System.out.println("mid1: "+mid); 
            }
            else
                {
                    mid = (0+mid)/2; 
                    // System.out.println("mid2: "+mid);
            }

        }

        System.out.println("Index: "+result);
    }
}
