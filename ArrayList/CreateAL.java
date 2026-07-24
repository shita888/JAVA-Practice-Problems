package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CreateAL {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);  
        al.add(4); 
        al.add(5); 
        // System.out.println(al);

// Prine using loop
        // for(Integer i: al){
        //     System.out.println(i);
        // }

// calculate sum 
// int sum=0;
//           for(Integer i: al){
//             sum = sum+i;
//         }
//         System.out.println(sum);

//Find MaximumRemove Even Numbers
//    int max = 0;
//          for(Integer i: al){
//             if(max<i){
//                 max = i;
//             }
//         }
        // System.out.println(max);

// Count Even Numbers 
// int c=0;
//          for(Integer i: al){
//             if(i%2==0){
//                  c++;
//             }
//         }
//         System.out.println(c);

//Remove Even Numbers
        // int i=0;
        // while(i<al.size()){
        //     if(al.get(i)%2==0){
        //         al.remove(i);
        //     }
        //     i++;
        // }
        // System.out.println(al);

//Reverse an ArrayList
        // java.util.Collections.reverse(al);
        // System.out.println(al); 

//Find Duplicate
        // System.out.println(al);
        // for(int i=0;i<al.size();i++){
        //     for(int j=i+1;j<al.size();j++){
        //         if(al.get(i)==al.get(j)){

        //             System.out.println(al.get(i));
        //         }
        //     }
        // }

//Merge Two ArrayLists
// ArrayList<Integer> bl = new ArrayList<>();
// bl.add(10);
// bl.add(20);
// bl.add(30);

// ArrayList<Integer> ans = new ArrayList<>();
//         for(int i=0;i<al.size();i++){
//             ans.add(al.get(i));
//         }
//         for(int i=0;i<bl.size();i++){
//             ans.add(bl.get(i));
//         }

//         System.out.println(ans);

//Remove Duplicates
// int n=0;
//         System.out.println(al);
//         for(int i=0;i<al.size();i++){
//             for(int j=i+1;j<al.size();j++){
//                 if(al.get(i)==al.get(j)){

//                      n=al.get(i);
//                 }
//             }
//         }

//         for(int i=0;i<al.size();i++){
//             if(n==al.get(i)){
//                 al.remove(i);
//             }
//         }

//Return List of Squares
ArrayList<Integer> sqr = new ArrayList<>() ;
    int s=0;
    for(Integer i : al){
        s = i*i;
        sqr.add(s);
    } 
    System.out.println(sqr);


    }
}
