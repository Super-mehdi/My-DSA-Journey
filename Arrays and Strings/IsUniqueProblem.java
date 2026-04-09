import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsUniqueProblem {
    private final static int ASCII_COUNT=128;
    //private final static int UNICODE_COUNT=65536;
    /*
        Problem goal : Determine if all chars in a String are unique.
    */
    

    public static boolean isUniqueImplWithHashTable(String testedString){
        Map<Character,Integer> charCounter=new HashMap<>();
        for (Character charKey:testedString.toCharArray()){
            Character lowercaseCharKey=Character.toLowerCase(charKey);
            if (charCounter.containsKey(lowercaseCharKey)){
                return false;
            }
            charCounter.put(lowercaseCharKey, 1);
        }
        return true;
    }

    public static boolean isUniqueImplWithBoolArr(String testedString){
        if (testedString.length()>128){
            return false;
        }
        boolean[] chars= new boolean[ASCII_COUNT];
        for (char character:testedString.toCharArray()){
            if (chars[(int)character]==true){
                return false;
            }
            chars[(int)character]=true;
        }

        return true;
    }

    public static boolean isUniqueImplWithVector(String testedString){
        int checker=0;
        for (int i=0;i<testedString.length();i++){
            int val=testedString.toLowerCase().charAt(i) -'a';
            if ((checker & (1 << val))>0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static boolean isUniqueImplWithSet(String testedString){
        Set<Character> foundChars=new HashSet<>();
        for (Character currentChar:testedString.toCharArray()){
            Character lowercaseCurrentChar=Character.toLowerCase(currentChar);
            if (foundChars.contains(lowercaseCurrentChar)){
                return false;
            }
            foundChars.add(lowercaseCurrentChar);
        }
        return true;
    }


    
}
