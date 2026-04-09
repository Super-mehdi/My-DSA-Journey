import java.util.HashMap;
import java.util.Map;

public class PalindromPermutation {
    /*
    potential palindrome conditions : 
     - at most one odd.
     - the others must all be even.
    */

     //My own solution : good but not BCGx good
    public static boolean isPalindromPermutation(String str){
        char[] charArray=str.replace(" ", "").toLowerCase().toCharArray();
        Map<Character,Integer> countKeeper=new HashMap<>();
        boolean flag=false;
        for (char c:charArray){
            countKeeper.put(c, countKeeper.getOrDefault(c,0)+1);
        }
        for (Integer value:countKeeper.values()){
            if (value%2==1){
                if (flag) return false;
                flag=true;
            }
        }
        return true;
    }

    //Solution 1

    //boolean isPermutationOfPalindrome String
    /*public static boolean isPermutationOfPalindrome(String str){
        int[] table=buildCharFrequencyTable(str);
        return checkMaxOneOdd(table);
    }*/
    //boolean checkMaxOneOdd int[]
    public static boolean checkMaxOneOdd(int[] table){
        boolean oneOdd=false;
        for (int count:table){
            if (count%2==1){
                if (oneOdd) return false;
                oneOdd=true;
            } 
        }
        return true;
    }
    //int getCharNumber Character
    public static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val=Character.getNumericValue(c);
        if (val < a || val > z){
            val = -1;
        } else val -= a;
        return val;
    }
    //int[] buildCharFrequencyTable String
    public static int[] buildCharFrequencyTable(String str){
        int[] table=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for (char c:str.toCharArray()){
            if (getCharNumber(c)!=-1) table[getCharNumber(c)]++;
        }
        return table;   
    }

    //Solution 2 : A slightly better approach(we are counting odds as we go)
    /*public static boolean isPermutationOfPalindrome(String stringToVerify){
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        int oddCount=0;
        for (char c : stringToVerify.toLowerCase().toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                if (++table[x]%2 == 1) oddCount++;
                else oddCount--;
            }
        }
        return oddCount<=1;
    }*/
   
    //Solution 3 : use a bit vector (some shit that I never got, but this time imma understand that)
    public static boolean checkExactlyOneBitSet(int bitVector){
        return (bitVector & (bitVector-1)) == 0;
    }

    public static int toggle(int bitVector, int index){
        if (index < 0) return bitVector;
        int mask = 1 << index;
        if ((bitVector & mask) == 0){
            bitVector |= mask;//on
        } else {
            bitVector &= ~mask;//off
        }
        return bitVector;
    }

    public static int createBitVector(String phrase){
        int bitVector=0;
        for (char c : phrase.toCharArray()){
            int x=getCharNumber(c);
            bitVector = toggle(bitVector,x);
        }
        return bitVector;
    }

    public static boolean isPermutationOfPalindrome(String phrase){
        int bitVector=createBitVector(phrase);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }


}
