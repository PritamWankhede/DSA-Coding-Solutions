package String;

import java.util.Arrays;

public class LongestWordInSentence {
  public static String wordInSentence(String sentence){
      String[] strArray = sentence.split(" ");

      if(strArray.length == 0){
          return "";
      }

      String longestWord = strArray[0];
      for(int i=1; i < strArray.length ; i++){
          if(strArray[i].length() > longestWord.length()){
              longestWord = strArray[i];
          }
      }

      return longestWord;
  }

    public static void main(String[] args){
        String sentence = "I love programming";
        System.out.println(wordInSentence(sentence));
    }
}