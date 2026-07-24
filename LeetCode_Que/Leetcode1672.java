package LeetCode_Que;

public class Leetcode1672 {
    public static int maximumWealth(int[][] accounts) {
 
        int arr[] = new int[accounts.length];  
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts.length;j++){
                sum = sum + accounts[i][j];
            }
            System.out.println(sum); 
            arr[i] = sum;
        }

        int max = arr[0];
        for(int j=0;j<arr.length;j++){
            if(max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println(max);

        return max;
    }
    public static void main(String[] args) {
        int[][] accounts = { {1,5}, {7,3}, {3,5} };
        maximumWealth(accounts);
    }
}
