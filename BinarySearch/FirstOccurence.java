package BinarySearch;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,5};
        int mid = arr.length/2;
        int t = 2,result = -1,f=0,l=0;
        for(int i=0; i<=mid; i++){
            if(t > arr[mid])
            {
                mid = (mid+arr.length)/2;  
            }
            else if(t < arr[mid])
            {
                mid = (0+mid)/2;  
            }
            else if(t == arr[mid]){ 
                result = mid; 
                for(int j=0;j<result;j++){
                    if(arr[result]==arr[j]){
                        // System.out.println("1st: "+j);
                        f=j;  
                    }else{
                        f=result;
                    }
                }
                for(int j=result+1;j<arr.length;j++){
                    if(arr[result]==arr[j]){
                        // System.out.println("Last: "+j); 
                        l=j; 
                    }else{
                        l=result;
                    }
                }
            }

        }
        // System.out.println("Result: "+result);
        System.out.println("1st: "+f);
        System.out.println("last: "+l);


    }
}
