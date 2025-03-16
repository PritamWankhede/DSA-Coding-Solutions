package String;

public class CountVowelsAndConsonants {
    public static void findNumberOfVowelsAndConsonants(String s)
    {
        if(s.length() ==0){
            System.out.println("String is Empty");
            return;
        }

      int vowel = 0;
      int consonants = 0;
      String word = s.toLowerCase();

      for(char ch : word.toCharArray())
      {
          if (!Character.isLetterOrDigit(ch)) {
              continue;
          }

          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
              vowel++;
          }
          else{
              consonants++;
          }
      }
        System.out.println("vowel : " + vowel + " " + "consonants : "+ consonants);
    }

    public static void main(String[] args)
    {
        String str = "hello how are  ? ? m  ";
       findNumberOfVowelsAndConsonants(str);
    }
}