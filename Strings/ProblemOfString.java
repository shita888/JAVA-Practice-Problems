public class ProblemOfString {
    public static void main(String[] args) {
         
        // String s1 = "";
        // for(int i=0;i<5;i++){
        //     s1 = s1 + i;
        //     System.out.println(s1);
        // }
    //         ""
    //         0
    //         01
    //         012
    //         0123
    // s1----->01234    

         //  The problem of String in java 
         //  in this example ,String s1 creates too many objects in heap memory ,
         //  jabki bas ek hi last wali String jo he kamki he isi karan StringBuilder and Stringbuffer aaya.


        String s = "java";
        System.out.println(s.hashCode());
    }
}
