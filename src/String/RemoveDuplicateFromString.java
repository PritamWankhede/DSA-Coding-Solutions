package String;

import java.util.*;

public class RemoveDuplicateFromString {
    public static String removeDuplicate(String s){
        LinkedHashSet<Character> set =  new LinkedHashSet<>();
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){
            set.add(ch);
        }

        for(char ch : set){
            res.append(ch);
        }
        return res.toString();
    }

    public static void main(String[] args){
       String str = "banana";
        System.out.println(removeDuplicate(str));
    }
}