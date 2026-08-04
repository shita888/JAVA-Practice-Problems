package LeetCode_Que;

public class Leetcode912 {
    public static int[] sortArray(int[] nums) {

    for(int i=0;i<nums.length;i++){ 
        int s=0;
        int e=s+1;
        while(e!=nums.length){
           if(nums[s]>nums[e]){ 
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
            }
            s++;
            e++;
        }
    }




        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]<nums[j]){ 
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     } 
        // }

//Selection Sort....

        // for(int i=0;i<nums.length;i++){
        //     int min = i;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]<nums[min]){
        //             min = j;
        //         }   
        //     } 
        //  int temp = nums[min];
        //  nums[min] = nums[i];
        //  nums[i] = temp;

        // }
// Insertion Sort.......

// for(int i=0;i<arr.length;i++){
//                 int s = i;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]<arr[j]){
//                     int temp = arr[j];
//                     arr[j] = arr[s];
//                     arr[s] = temp; 
//                     if(s>i){ 
//                     s--;
//                     }
//                 }
//             }
            
//         }


        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        // int nums[] = {5,1,1,2,0,0};
        sortArray(nums);
    }
}
