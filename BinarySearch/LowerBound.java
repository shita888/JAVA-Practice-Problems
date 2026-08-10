package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};

        int t = 6;
        int result = -1;
        int mid1=0;
        int mid = (0+arr.length)/2; 

 // Lower Bound.........       
        for(int i=0;i<=mid;i++){
            if(t > arr[mid])
            {
                mid = (mid+arr.length)/2;   
            }
            else if(t < arr[mid])
            {
                mid1 = mid-1; 
                mid = (0+mid)/2;   
            }
            else if(t==arr[mid]){
                mid1 = mid; 
            }
        } 

        System.out.println("Index: "+mid1);
        
// Upper Bound.............      
        // for(int i=0;i<=mid;i++){
        //     if(t >= arr[mid])
        //     {
        //         mid1 = mid+1;
        //         mid = (mid+arr.length)/2;   
        //     }
        //     else if(t < arr[mid])
        //         {
        //             mid = (0+mid)/2;   
        //         }
        // }
        // System.out.println("Index: "+mid1);




    }
}
