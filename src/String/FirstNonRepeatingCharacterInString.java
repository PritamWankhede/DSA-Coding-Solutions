package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {
    public static Character nonRepeatingCharacter(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> e: map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return null;
    }

      public static void main (String[]args){
            String str = "aambbcddk";
            System.out.print(nonRepeatingCharacter(str));
        }
}
