package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

    // Given two strings write a method to decide if one is a permutation of the other

    public static void main(String[] args) {

    }

    /*
        If we have two strings for example str1= 'abcd' and  str2= 'dcba'
        Permutation: The exchange of two characters in a given string.

        I can permute str2 as follows:
        1. Permute 'd' with 'a' -> 'acbd'
        2. Permute 'c' with 'b' -> 'abcd'
        3. When I'm done, If the comparison returns true then the strings are permutable.

        Requirments for Permutations
        1. Strings must have equal length.
        2. Strings must have the same characters.
        3. Strings must have the same amount of characters.
     */

    public static boolean checkPermutationV1(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        Map<Character,Integer> characters = new HashMap<>();

        for (int i =0; i<str1.length(); i++) {
            char character = str1.charAt(0);
            Integer count = characters.get(character);
            if(count == null){
                characters.put(character,1);
            } else {
                characters.put(character,count +1);
            }
        }
        return true; // TODO this is wrong i think
    }

    public static boolean checkPermutationV2(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        return sortString(str1).equals(sortString(str2));
    }

    // This solution provides O(n log n) time complexity.

    public static String sortString(String str){
        char[] stringContent = str.toCharArray();
        Arrays.sort(stringContent);
        return new String(stringContent);
    }
}
