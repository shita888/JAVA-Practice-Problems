public class Ps15 { 
    // public void reverseString(char[] s) {
        
    // } 
    public static void main(String[] args) {
         char arr[] = {'H','E','L','L','O'};
        for(int i=0;i<arr.length;i++){
            System.out.print((char)i);
        }
        System.out.println();
        for(int j=arr.length-1;j>=0;j--){
            System.out.print((char)j);
        } 
    }
}
