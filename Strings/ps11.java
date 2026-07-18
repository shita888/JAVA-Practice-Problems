import java.util.Scanner;                      // jitane perfect square he un sab pe bulb ON rahate he
                                                //   20 ->  1,4,9,16 ;  ON - 4 ;
public class ps11 {  
    public static int bulbSwitch(int n) { 
        int arr[] = new int[n]; 
        for(int i=0;i<arr.length;i++){
                arr[i] = 0; 
        }
        
        for(int i=0;i<arr.length;i++){
            int s = i;
            int k=s;
            while(k<arr.length){
                // System.out.println(arr[k]);
                if(arr[k]==1){
                    arr[k] = 0; 
                }else{
                    arr[k] = 1; 
                }
                if(k==arr.length-1){
                    break;
                    
                }
                k=k+(s+1); 
            } 
        }
         
int c=0;
        for(int j=0;j<arr.length;j++){
           if(arr[j]==1){
            c++;
           }
        } 
        System.out.println(c);
        return c;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();
        bulbSwitch(n);
    } 
}
//......................
 import java.util.Scanner;
 class Solution {
    public static int bulbSwitch(int n) { 
            int count=0,c=0; 
        for(int i=1;i<=n/2;i++){
            c = i*i; 
            for(int j=1;j<=n;j++){
                if(c==j){
                    count++;
                }  
            }
         System.out.println(c);
        }  
        return count;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        bulbSwitch(1);
    }
}