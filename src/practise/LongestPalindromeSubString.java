package practise;

public class LongestPalindromeSubString {
    static   int result = 0;;


    public static int findSubstring(String s){


        if(s.length()<2)
            return s.length();

        for(int i=0; i<s.length(); i++){

            extendPalindrome(s,i, i);

        }


        return 1;
    }


    private static void extendPalindrome(String s, int begin, int begin1){
        while(begin>=0 && begin1<s.length() && s.charAt(begin)==s.charAt(begin1)) {
            result++;
            begin--;
            begin1++;
        }
    }





}
