public class StringQue {
    public static void main(String[] args) {

        // int range -2,147,483,648  to  2,147,483,647
        int x=1534236469;
        // int x=123;
           int rem , rev=0;
           int p=-1; 
        
       
    if(x<0){
        x = p*x; 
        while(x>0){
            rem = x%10;  
            rev = rev*10+rem;
            x=x/10;
        }
        rev = rev*p; 
         
    }else{

        while(x>0){
            rem = x%10; 
            rev = rev*10+rem; 
                if(rev > 214748364|| rev > 214748364 && rem > 7){ 
                    System.out.println("Overflow");
                    rev = 0;
                }  
            x=x/10;
        }    

    }
 
        System.out.println(rev);
        // System.out.println(rev2);
  

    }
}
