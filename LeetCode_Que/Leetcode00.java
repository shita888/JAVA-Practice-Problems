package LeetCode_Que;

public class Leetcode00 {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
        //insertion sort
        for(int i=0;i<arr.length;i++){
                int s = i;
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[s];
                    arr[s] = temp; 
                    if(s>i){ 
                    s--;
                    }
                }
            }
            
        }
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j]);
                
            } 
    }
}
