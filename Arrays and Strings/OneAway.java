public class OneAway {
    // So, we'll have to check if two strings are one edit away from each other.
    // 1 edit = insertion, deletion or replacement.
    // I notice that from the lengths of the strings, we can guess which edits has been performed
    // if the strings are the same length => check for replacements.
    // if len(str1) = len(str2) -1 => check for insertion or deletion.
    // else reject


    //My own solution, ugly but it works.
    public static boolean isOneAway(String str1, String str2){
        if (str1.length() > str2.length()){
            String tmp=str1;
            str1=str2;
            str2=tmp;
        }
        if (str1.length() < str2.length()-1) return false;//If str1.length() < str2.length(), the only possible transformation (from str1 t str2) is insertion, which is deletion 
        int n=str1.length();
        if (str1.length() == str2.length()){//Check for replacement
            boolean replacedOnce=false;
            for (int i=0;i<n;i++){
                if (str1.charAt(i) != str2.charAt(i)){ 
                    if (replacedOnce) return false;
                    replacedOnce=true;
                }
            }
        }
        int i=0,j=0;
        boolean skipped=false;
        if (str1.length() == str2.length()-1){
            while (i<n){
                if (str1.charAt(i)==str2.charAt(j)){
                    i++;
                    j++;
                } else if (!skipped){
                    j++;
                    skipped=true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
