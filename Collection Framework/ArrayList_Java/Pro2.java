package ArrayList_Java;

import java.util.*;

public class Pro2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // a1.add(1);
        // a1.add(2);
        // a1.add(3);

        // int j=5;
        // while(j>0){
        //     int ip = sc.nextInt();
        //     a1.add(ip);
        //     j--;
        // }

        // System.out.println(a1);

        // for (Integer i : a1) {
            //   System.out.println(i);
        // } 

        ArrayList<String> s1 = new ArrayList<>();
        // System.out.println("Enter String Ele:");
        // int n = 3;
        // while(n>0){
        //     String s = sc.nextLine();
        //     s1.add(s);
        //     n--;
        // }
        
        s1.add("Shital");
        s1.add("Vansh");
        s1.add("Sejal");
        s1.add("Sneha"); 
        
        String ss = "Shital";
        // String ss = "Shree"; 
        boolean b = false;
        for(String i : s1){
            if(ss.equals(i)){
                 b = true;
                break;
            } 
        }

        if(b==false){
            System.out.println("No");
        }else{
            System.out.println("yes");
        }


        // s1.remove(0);
        // System.out.println(s1);
        

    }
}
