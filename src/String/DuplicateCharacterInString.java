package String;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {

   public static String findCharacter(String s)
   {
       Map<Character,Integer> map = new HashMap<>();

       for(char c : s.toCharArray())
       {

           map.put(c, map.getOrDefault(c,0)+1);
       }

      for(Map.Entry<Character,Integer> entry : map.entrySet())
      {
          if(entry.getValue() > 1)
          {
              System.out.println(entry.getKey() + " : " + entry.getValue());
          }
      }
       return "No unique character found";
   }

    public static void main(String[] args)
    {
        String str = "hellohowareyoukkk";
        System.out.println(findCharacter(str));
    }
}
