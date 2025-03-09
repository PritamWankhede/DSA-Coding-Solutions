package String;

public class ReverseWords {
    public static String reverseString(String s){
       int left = s.length()-1;
       int pointer = s.length()-1;
       String result = "";

       while(left >=0){
           while(left >= 0 && Character.isLetterOrDigit(s.charAt(left))){
              left--;
           }

           result += s.substring(left+1, pointer+1) + ".";

           while(left >= 0 && !Character.isLetterOrDigit(s.charAt(left))){
               left--;
           }
           pointer = left;
       }
       return result;
    }
    public static void main(String[] args) {
        String str = "i.like.this.program";
        System.out.println(reverseString(str));
       }
    }