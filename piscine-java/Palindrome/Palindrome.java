public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
        String res = "";
        int i = s.length() - 1;
        System.out.println("i =>   "+i);
        while (i >= 0){
            char a = s.charAt(i);
            res += a;
            i--;
        }
        System.out.println("===========>"+s );
        System.out.println("===========>"+res);
        
        if (res.equals(s)){
            return true;
        }else{
            return false;
        }
        
    }
}