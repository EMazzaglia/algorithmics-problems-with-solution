package ArraysAndStrings;

public class JewelsAndStones {


    public static void main(String[] args) {
        String  jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);

    }

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;


        for(int i=0; i< stones.length();i++){
            if(jewels.indexOf(stones.charAt(i)) != -1){
                result++;
            }
        }


        return result;
    }
}
