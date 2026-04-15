public class StringCompression {
    public static String compressString(String str){
        if (str.length()==0 || str == null) return str;
        char currentChar=str.charAt(0);
        int charCount=1;
        StringBuilder compressedStr=new StringBuilder();
        for (char c : str.substring(1).toCharArray()){
            if (c == currentChar) charCount++;
            else{
                compressedStr.append(""+ currentChar+charCount);
                currentChar=c;
                charCount=1;
            }
        }
        compressedStr.append(currentChar).append(charCount);
        String result=compressedStr.toString();
        return (result.length()>=str.length())?str:result;
    }
    
}
