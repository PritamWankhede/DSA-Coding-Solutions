package String;

public class Pallindrome {
    public static String isPallindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return "not pallindrome String";
            }
            left++;
            right--;
        }
        return "String pallindrome";
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPallindrome(s));
    }
}
