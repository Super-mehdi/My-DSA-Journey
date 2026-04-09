public class OneAway {
    // So, we'll have to check if two strings are one edit away from each other.
    // 1 edit = insertion, deletion or replacement.
    // I notice that from the lengths of the strings, we can guess which edits has been performed
    // if the strings are the same length => check for replacements.
    // if len(str1) = len(str2) -1 => check for insertion or deletion.
    // else reject

    public static boolean isOneAway(String str1, String str2){
        if (str1.length() > str2.length()){
            String tmp=str1;
            str1=str2;
            str2=tmp;
        }
        if (str1.length() < str2.length()-1) return false;
        if (str1.length() == str2.length()){
            int n=str1.length();
            for (int i=0;i<n;i++){
                if (str1[i] != str2[i]) return false;
            }
        }
        return true;
    }
}
