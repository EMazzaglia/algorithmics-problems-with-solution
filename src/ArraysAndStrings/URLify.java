package ArraysAndStrings;

public class URLify {
    /*
    Write a method to replace all spaces in a string with '%20'. You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given the "true"
    length of the string. (Note: If implementing in Java, please use a character array so that you can
    perform this operation in place.)

    EXAMPLE
    Input:  "Mr John   %20Smith", 13
    Output: "Mr%20John%20Smith"

    1. "Mr%20John"

     */

    public static void main(String[] args) {
        char[] charArray = "Mr John Smith    ".toCharArray();
        urlify(charArray, 13);
        System.out.println(charArray);
    }

    public static void urlify(char[] str, Integer trueLength) {
        int spaceCount = 0,i, index = 0;

        for(i = 0; i< trueLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;

        if(trueLength < str.length){
            str[trueLength] = '\n'; //End array
        }

        for(i = trueLength - 1; i >= 0; i--){
            if(str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index-=3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
