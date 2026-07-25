package LeetCode_Que;
import java.util.ArrayList;
import java.util.List;

public class Leetcode989 { 
public static List<Integer> addToArrayForm(int[] num, int k) {
         List<Integer> al = new ArrayList<>();  
 
 
    // int rem ,rem1,rem2;
    // for(int i=num.length-1;i>=0;i--){
    //     rem = k%10; 
    //     num[i] = num[i]+rem; 
    //     int n = num[i];
    //         if(n>=10){  
    //             rem1 = n%10;
    //             num[i]=rem1; 
    //             rem2 = n/10;
    //             num[i-1] = num[i-1]+rem2;  
    //         }
    //         k=k/10;   
    // } 




    // for(int i=0;i<num.length;i++){ 
    //     al.add(num[i]); 
    // }
    // System.out.println(al);
 
    // int rem ,rem1,rem2,b,b2; 

    // for(int i=al.size()-1;i>=0;i--){
    //     rem = k%10; 
    //     int n = al.get(i)+rem; 
    //       al.set(i,n);

    //       if(i!=0){ 
    //          if(n>=10){  
    //             rem1 = n%10;
    //             al.set(i,rem1); 
    //             rem2 = n/10;
    //             int m = al.get(i-1)+rem2;  
    //              al.set(i-1,m);
    //         }
    //       }else{
    //          if(n>=10){ 
    //              b = n%10;
    //             //  System.out.println(b);
    //              al.set(i,b); 
    //              b2 = n/10; 
    //              al.add(i,b2);
    //          } 
    //       }
            
    //         k=k/10;  
    // } 
    // System.out.println(al);
    //     return al;
    // }


// modify code............  
 
    int  carry=0;

    for(int i=num.length-1;i>=0;i--){
       int  rem = k%10; 
        int n = num[i]+rem+carry; 
        // System.out.print(n+" ");  
        al.add(0,n%10); 
        carry = n/10;
        k=k/10;  
        }  
        
        while (k > 0) { 
        int rem = k % 10; 
        int sum = rem + carry; 
        carry = sum / 10; 
        al.add(0, sum % 10); 
        k = k / 10;
    }

    if (carry > 0) {
        al.add(0, carry);
    }
    System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        int num[] = {9,9,9};
        int k=1;
        addToArrayForm(num,k);
    }
}
