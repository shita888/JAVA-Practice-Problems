package Arrays_Practise;

public class MaxSub {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k=4;
        int s=0,e=k-1;
    int sum=0;
    for(int i=s;i<=e;i++){
        sum = sum+arr[i];
    }
    System.out.println(sum);
        while(e<arr.length-1){
            sum = sum-arr[s];
            s++;
            e++;
            sum = sum+arr[e]; 
        }
    System.out.println(sum);
    }
}
