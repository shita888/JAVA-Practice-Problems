public class ps13 { 
    public static int[] productExceptSelf(int[] nums) {
        int brr[] = new int[nums.length];
        int n=0;
        for(int i=0;i<nums.length;i++){ 
            int p=1; 
              for(int j=0;j<nums.length;j++){
                  if( nums[j]==nums[i] && j==i){
                    continue;
                  }else{ 
                    p=p*nums[j];
                  }
              }
        System.out.println(p);
         brr[i] = p;
         }
        return brr;
    }
     
    public static void main(String [] args){
        int nums[]={0,0};  
        productExceptSelf(nums);
    } 
}
