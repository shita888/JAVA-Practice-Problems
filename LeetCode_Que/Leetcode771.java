package LeetCode_Que;

public class Leetcode771 {
    public static int numJewelsInStones(String jewels, String stones) {
        // jewels.toCharArray(); 
        int c=0;
        int j = 0;
        while(j!=jewels.length()){ 
            for(int i=0;i<stones.length();i++){
                System.out.println(jewels.charAt(j));
                if(jewels.charAt(j)==stones.charAt(i)){
                    c++;
                } 
            }
            j++;
        }

        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels,stones);
    }
}
