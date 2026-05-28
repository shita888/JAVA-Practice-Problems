import java.util.Scanner;
public class create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];


        // for(int i=0;i<arr.length;i++){
        //         for(int j=0;j<arr.length;j++){
        //                 System.out.print(arr[i][j]+ " ");
        //         }
        //         System.out.println();
        // }

        //  for(int i=0;i<arr.length;i++){
        //         for(int j=0;j<arr.length;j++){
        //             System.out.print("Element["+i+"]["+j+"] :");
        //              arr[i][j] = sc.nextInt();
        //         }
        //         System.out.println();
        // }
        // int sum=0; 
        //  for(int i=0;i<arr.length;i++){
        //         for(int j=0;j<arr.length;j++){
        //                 System.out.print(arr[i][j]+ " ");
        //                 sum=sum+arr[i][j]; 
        //         }
        //         System.out.println();
        // }
        // System.out.println("sum:"+sum);

       
int arr[][]={{2,3,44},{5,6,7},{8,0,0}};
 for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                        // System.out.print(arr[i][j]+ " ");
                }
                // System.out.println();
        }




        int sum=0,max=0,r=0; 
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=0;j<arr.length;j++)
                {
                    // System.out.print(arr[i][j]+ " ");
                    sum=sum+arr[i][j]; 
                }
                System.out.println();
                System.out.println("sum:"+sum);
                max = sum;
                if(max<sum){
                    max = sum;
                    r=i;
                } 
            } 
            System.out.println("Row: "+r+","+max);



        // int max=arr[0][0];
        //  for(int i=0;i<arr.length;i++){
        //         for(int j=0;j<arr.length;j++){

        //             if(max < arr[i][j]){
        //                max = arr[i][j];
        //             } 

        //         } 
        // } 
        // System.out.println("Max Value: "+max);



    }
}
