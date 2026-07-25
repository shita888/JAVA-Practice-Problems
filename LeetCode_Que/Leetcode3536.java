package LeetCode_Que;

public class Leetcode3536 {
    public static int maxProduct(int n) {
        int c=0,m=n;
        while(m>0){
            int rem = m%10;
            c++;
            m=m/10;
        }
        int arr[] = new int[c];
        System.out.println(arr.length);

        int i=arr.length-1;
        while(n>0){
            int rem = n%10;
            arr[i] = rem;
            n=n/10;
            i--;
        }
 
        int max = 0;
        for(int s=0;s<arr.length;s++){
            for(int j=s+1;j<arr.length;j++){
                int m1 = arr[s]*arr[j]; 
                if(max<m1){
                    max=m1;
                }

            }
        }
        System.out.println(max); 

        return 1;
    }
    public static void main(String[] args) {
        int n = 22;
        maxProduct(n);
    }
}
