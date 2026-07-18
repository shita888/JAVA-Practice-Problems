public class ps8 {

    public static int gcdOfOddEvenSums(int n) {
        int sumE=0, sumO=0;
          System.out.print("Even:");
         
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                System.out.print(i);
                sumE = sumE+i;
            } 
        } 
         System.out.print("\nOdd:");
        for(int i=1;i<=n*2;i++){
            if(i%2!=0){
                System.out.print(i);
                sumO = sumO+i;
            } 
        }
        System.out.println();
        System.out.println(sumE+" "+sumO);

        int gcd=0;
        int a = sumE , b = sumO;
        if(a>b){ 
            for(int i=1;i<=a/2;i++){
                if(a%i==0 && b%i==0){
                    gcd = i; 
                } 
            }
            System.out.println("GCD:"+gcd);
        }else{
            for(int i=1;i<=b/2;i++){
                if(a%i==0 && b%i==0){
                    gcd = i; 
                } 
            }
            System.out.println("GCD:"+gcd); 
        }
        return gcd;
    }
    public static void main(String[] args) {
        int n = 4;
        gcdOfOddEvenSums(n);
    }
}
