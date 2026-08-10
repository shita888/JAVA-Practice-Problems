package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
                int arr[] = {1,3,5,6};

        int t = 6;
        int result = -1; 
        int mid = (0+arr.length)/2; 
 
        for(int i=0;i<=mid;i++){
            if(t > arr[mid])
            {
                mid = (mid+arr.length)/2;   
                result = mid+1; 
            }
            else if(t < arr[mid])
            { 
                mid = (0+mid)/2;  
                result = mid+1; 
            }
            else if(t==arr[mid]){
                // result = mid; 
                result = mid+1; 
            }
        } 

        System.out.println("Index: "+result);
    }
}
