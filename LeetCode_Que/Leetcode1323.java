package LeetCode_Que;

public class Leetcode1323 {
    public static int maximum69Number (int num) {
 
        int rem ,rev=0,c=0,nine=0;
        int max=0;
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            if(rem == 9){
                nine++;
            }
            c++;
            num = num/10;
        }

 if(nine == c){
    System.out.println("yes");
    max = rev;
 }else{
        
        System.out.println(rev);  
        int n=rev;
        int brr[] = new int[c];
        int arr[] = new int[c];
        int rem1 ,i=0;
        while(n>0){
            rem1 = n%10;
            arr[i] = rem1;
            brr[i] = rem1;
            n = n/10;
            i++;
        }
 

        for(int k=0;k<arr.length;k++){
        int m=0;
        for(int j=0;j<arr.length;j++){ 
            if(arr[k]==6){
                arr[k]=9;  
                break;
            }
            if(arr[k]==9){
                arr[k]=6; 
                break; 
            }
        } 
        for(int j=0;j<arr.length;j++){ 
            System.out.print(arr[j]+" ");
            m = m*10+arr[j];
        } 
        
        if(max<m){
                max = m;
             }
            System.out.println(); 
            // System.out.println(m);

//reset array
            for(int j=0;j<brr.length;j++){  
                arr[j]=brr[j];
            } 
    } 
}   
System.out.println("Max: "+max);
        return max;
    }
    public static void main(String[] args) {
        
        int num = 9999;
        maximum69Number(num);
    }
}
