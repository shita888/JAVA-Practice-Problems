//......Leetcode 989 problem
 public class ps6 {
    public static int addToArrayForm(int[] nums, int k) {
        int n =0,cn=0,ck=0,k1=k,rem2;
        //......
        while(k1>0){
           rem2 = k1%10;
           ck++;; 
           k1=k1/10;
        } 
        //,.......
        for(int i=0;i<nums.length;i++){ 
            n= (n*10)+nums[i];
        }
        System.out.println("Int:"+n);
        
//.........        
        int k2=n;
         while(k2>0){
           rem2 = k2%10;
           cn++;; 
           k2=k2/10;
        } 
//..........   
        n = n+k;
        System.out.println("Add:"+n); 
        
        int rem,rem1 ,rev=0;
        while(n>0){
           rem = n%10;
           rev = (rev*10)+rem;
           n=n/10;
        }
         System.out.println("Rev:"+rev);
         
        System.out.println();
        System.out.println("ele:"+ck);
        System.out.println("ele:"+cn);
        int m = rev;
        if(ck>=cn){
            if(ck==cn){
             int nums1[] = new int[ck+1]; 
                  int i=0;
                    while(m>0){
                        rem1 = m%10; 
                        nums1[i] = rem1;
                        i++;
                        m=m/10;
                    }
                    System.out.println("Array:");
                    for(int j=0;j<nums1.length;j++){ 
                        System.out.print(nums1[j]+" ");
                    }   
            }else{
             int nums1[] = new int[ck]; 
                  int i=0;
                    while(m>0){
                        rem1 = m%10; 
                        nums1[i] = rem1;
                        i++;
                        m=m/10;
                    }
                    System.out.println("Array:");
                    for(int j=0;j<nums1.length;j++){ 
                        System.out.print(nums1[j]+" ");
                    }   
            }
                 
        }else{
                       int i=0; 
                        while(m>0){
                        rem1 = m%10; 
                         nums[i] = rem1;
                         i++;
                         m=m/10;
                        }
        
                        System.out.println("Array:");
                        for(int j=0;j<nums.length;j++){ 
                        System.out.print(nums[j]+" ");
                        }   
            
        }
        
        return m;
    }
    public static void main(String args[]){  
        int num[]={2,1,5},k=806;
        addToArrayForm(num,k);
    }
}
//....................989
class Solution {
     public static List<Integer> addToArrayForm(int[] arr, int n) {
         int rem,rem1,k;
       
       int i=arr.length-1;
        while(n>0){
            rem = n%10;
            arr[i] = arr[i] + rem;
            if(arr[i]>10){  
                rem = arr[i]%10;
                rem1 = arr[i]/10;
                arr[i]=rem; 
                arr[i-1] = arr[i-1]+rem1;  
            }
            n=n/10;
            i--;
        }
         for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" "); 
        }
        int t=0,c=0;;
        for(int j=0;j<arr.length;j++){ 
            t = t*10+arr[j]; 
        }
        int r,t1 =t;;
        System.out.println();
        System.out.println(t);
        while(t>0){
            r = t%10; 
            c++;
            t=t/10;
        }
         
        int brr[] = new int[c];
        int l=brr.length-1;
        while(t1>0){
            r = t1%10; 
            brr[l] = r;
            t1=t1/10;
            l--;
        }
          for(int j=0;j<brr.length;j++){
            System.out.print(brr[j]+" "); 
        }
     }
    public static void main(String[] args) {
       int arr[]={2,1,5};
       int n = 806;
        
        addToArrayForm(arr,n);
       
        
    }
}