package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    /* Implement an algorithm to determine if a string has all unique characters.
       Try to not use additional data structures
    */

    public static void main(String[] args) {
        System.out.println(isUniqueV1("abcde"));
        System.out.println(isUniqueV2("123456abd78"));
        System.out.println(isUniqueV3("123456abd788"));

    }

    /*
        A String has unique characters when all the characters are the distinct.
        For example:

        'abc' = true
        'abcc' = false
        '' = false
        Some edge cases are: null, '' and we are going to assume that a != A for example.

        Given 'abcd' we are going to look for

        'a' is the first character and is unique.
        then we go to the second character 'b' and we check if 'a' == 'b'
        if not then our already checked string is 'ab'
        then we go to the next character 'c' and we compare if 'ab' contains 'c'
        if not then we add 'c' to the alreadyChecked characters 'abc' and we move forward to
        'd' and repeat the process.
     */

    public static boolean isUniqueV1(String word) {
        if(word == null || word.equals("")) return false;
        if(word.length() == 1) return true;

        char[] charArray = word.toCharArray(); //[a,b,c]

        for(int i = 1; i < charArray.length; i++) {
            for(int j = 0; j < i; j++){
                if(charArray[j] == charArray[i]) return false;
            }
        }
        return true;
    }
    // IsUniqueV1 is O(N^2) because for each character you need to search if it wasn't already present on true each index.

    public static boolean isUniqueV2(String word) {
        if(word == null || word.equals("")) return false;
        if(word.length() == 1) return true;

        Set<Character> charactersInWord = new HashSet<>();

        for(int i = 1; i < word.length(); i++) {
            if(charactersInWord.contains(word.charAt(i))){
                return false;
            } else {
                charactersInWord.add(word.charAt(i));
            }
        }
        return true;
    }

    /* isUniqueV2 is O(N logN) because for each character you look if is already present and searching on HashMap or HashSet which is the same,
     has log N time in the worst case.
     */

    public static boolean isUniqueV3(String word) {
        if(word.length() > 128) return false;

        boolean[] charSet = new boolean[128];

        for(int i = 1; i < word.length(); i++) {
            int value = word.charAt(i);
            if(charSet[value]){
                return false;
            }
            charSet[value] = true;
        }
        return true;
    }

    /*
    isUniqueV3 is O(N) because for each character you look if is already present on the boolean array.
     */
}
