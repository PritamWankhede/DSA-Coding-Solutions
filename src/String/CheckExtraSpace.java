package String;

public class CheckExtraSpace {
    public static Boolean checkExtraCharacterInString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1 ; j<str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "abcde";
        System.out.println(checkExtraCharacterInString(str));
    }
}

//Check if a String Contains Only Unique Characters (Without Extra Space)
//Example: "abcdef" → true, "aabbcc" → false