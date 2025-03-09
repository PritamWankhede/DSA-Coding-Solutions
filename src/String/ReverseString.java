package String;

public class ReverseString {
    public static String reverseString(String s){
        String result = "";
        int left = s.length()-1;
        for(int i = left ; i>=0 ; i--)
        {
            result += s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args)
    {
        String s = "Java";
        System.out.println(reverseString(s));
    }
}
