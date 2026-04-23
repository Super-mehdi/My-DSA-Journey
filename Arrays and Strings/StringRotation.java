public class StringRotation {
    /*
        Assume you have a method isSubstring which checks if one word is a substring
        of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
        call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
    */
    public static boolean isRotation(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        String s1s1=s1+s1;
        if (n1 == n2){
            return s1s1.contains(s2);
        }
        return false;
    }

    public static boolean isRotation2(String s1, String s2) {
        return s1.length() == s2.length() && (s1+s2).contains(s2);
    }

}