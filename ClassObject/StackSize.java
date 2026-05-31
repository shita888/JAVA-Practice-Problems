class StackSize{
    
   static int count = 0;

static void fun() {
    count++;
 System.out.println(count);
    fun();
}
 
        
    public static void main(String[] args) {  
         fun();
    }
}