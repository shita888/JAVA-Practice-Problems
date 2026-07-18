public class ps9 { 
    public static int maxProduct(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }  
        System.out.println("Max:"+max);

        // Duplicate..
        boolean b = false;
        int j=0;
        while(j<nums.length){
            int k=j+1;
            while(k<nums.length){
                if(nums[j]==nums[k] && max == nums[k]){
                     b = true;
                    //  System.out.println("yes");
                }
                k++;
            } 
            j++;
        }
int Smax=0;
    if(max == nums[0]){
         Smax=nums[1]; 
    }else{
         Smax=nums[0];  
    }
    
    if(b == false){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max && Smax<nums[i]){
                Smax = nums[i];
            }
        } 
        System.out.println("SecMax:"+Smax);

    } 
    if(b == true){ 
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=max && Smax<nums[i] ){
                Smax = nums[i];
            }
        } 
        System.out.println("SecMax:"+Smax);
    }

    int n1 = (max-1);
    int n2 = (Smax-1);
    int p =  n1*n2;
    System.out.println(p);

        return p;
    } 
    public static void main(String[] args) {
        int nums[]={10,2,5,2};
        maxProduct(nums);
    }
}
