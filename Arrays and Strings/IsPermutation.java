import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class IsPermutation {
    
    //Hints 1, 84, 122 and 131

    public static boolean isPermutationWithSort(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        char[] str1Arr=str1.toCharArray();
        char[] str2Arr=str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        return Arrays.equals(str1Arr, str2Arr);
    }

    public static boolean isPermutationWithHashTable(String str1, String str2){
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> str1AsMap=new Hashtable<>();
        for (char c : str1.toCharArray()){
            str1AsMap.put(c,str1AsMap.getOrDefault(c, 0)+1);
        }
        for (char c : str2.toCharArray()){
            str1AsMap.put(c,str1AsMap.getOrDefault(c, 0)-1);
            if (str1AsMap.get(c) < 0) return false;
        }
        return true;
    }

    public static boolean isPermutationWithArray(String str1, String str2){
        if (str1.length() != str2.length()) return false;

        int[] charCount=new int[256]; 
        for (char c : str1.toCharArray()){
            charCount[c]++;
        }
        for (char c : str2.toCharArray()){
            charCount[c]--;
            if (charCount[c] < 0) return false;
        }
        return true;
    }
}

