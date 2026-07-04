import java.util.Scanner;
public class ps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4]; 
        // int sum=0;
        System.out.print("Array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } 

        // System.out.print("Enter target:");
        // int  t = sc.nextInt();
        // int c=0;
         
//  for(int i=0;i<arr.length;i++){ 
            // if(t == arr[i]){
            //     System.out.println("Yes:"+arr[i]);
            //     c++;
            // }
            // System.out.println(arr[i]);
            // if(arr[i]<35){
            //     System.out.println("Roll No:"+i);
            // }
            // sum = sum+arr[i];
        // }
            // if(c==0){
            //     System.out.println("Not Present");
            // } 
  

        // int max = arr[0];
        // int smax = max;

        // for(int i=0;i<arr.length;i++){
            // if(max<arr[i]){
            //     max = arr[i];
            // } 
        // }
        // System.out.println("First Large:"+max);

        // for(int j=0;j<arr.length;j++){
        //  if( smax<arr[j] && max>arr[j])
        //     {
        //         smax = arr[j];
        //     }
        // }
        // System.out.println("Second Large:"+smax);


        int temp;
        // for(int i=0;i<arr.length;i++){ 
        //  for(int j=arr.length-1;j>=0;j--){
        //         temp = arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;  
        // } 
        // }

// Rotate array..................
 
    //     for(int i=1;i<=2;i++){ 
    //         int s =0;
    //     int e = arr.length-1; 
    //     while(s<e){
    //         temp = arr[s];
    //             arr[s]=arr[e];
    //             arr[e]=temp;  
    //             e--;  
    //     } 
    // }

// Move All Zeros to End..................
    //     int s=0; 
    //     int z=0;
    //      for(int i=0;i<=arr.length-1;i++){ 
    //         if(arr[i]==0)
    //         {
    //             z++;
    //         }
    //     }
    //      System.out.println("Zero:"+z);
    

    //    for(int j=0;j<z;j++){ 
    //        if(arr[j] == 0){
    //            s = j;  
    //         } 
    //     int e = arr.length-1;
    //     while(s<e){
    //         temp = arr[s];
    //         arr[s] = arr[e];
    //         arr[e] = temp;
    //         e--;
        
    //     }
    // }

// Find Duplicate Elements.................
 
//  for(int i=0;i<arr.length;i++){ 
//     int c=0;
//          for(int j=i+1;j<arr.length;j++){
              
//                if(arr[i]==arr[j]){
//                 System.out.println(arr[i]); 
//                }
//         } 
         
//         }
//........................

int m = arr[0];
for(int k=0;k<arr.length;k++){
    if(m<arr[k]){
        m = arr[k];
    }  
}
System.out.println("Max:"+m);
for(int i=1;i<=m;i++){ 
    int t=0;
   for(int j=0;j<arr.length;j++){ 
        if(i==arr[j]){
           t++; 
             break;
        } 
    } 
    if(t==0){
    System.out.println("Missing:"+i);
}
}  
 

 

System.out.print("Rotate Array:");
         for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }

 


    }
}
