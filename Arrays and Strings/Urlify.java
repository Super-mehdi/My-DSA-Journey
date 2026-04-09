public class Urlify{
    public static char[] urlify(char[] str, int trueLength){
        int spacesCount=0;
        for (int i=0;i<trueLength;i++) {
            if (str[i]==' ') spacesCount++;
        }
        int index= trueLength + 2*spacesCount; //the one holding the space is already counted
        for (int i=trueLength-1; i>=0;i--){
            if (str[i]==' '){
                str[index-1]='0';
                str[index-2]='2';
                str[index-3]='%';
                index-=3;
            } else{
                str[index-1]=str[i];
                index--;
            }
        }
        return str;
    }
}