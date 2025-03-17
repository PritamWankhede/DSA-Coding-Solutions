package String;

import java.util.Arrays;

public class StringAnagram {

    public static Boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

       char[] array1 = s1.toCharArray();
       char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

      return Arrays.equals(array1,array2);
    }

    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1,str2));
    }
}