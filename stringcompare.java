import java.util.*;

class stringcompare{
    public static void main(String args[]){
        String str  ="aaabbccddd";
        String newstr ="";

        for(int i=0;i<str.length();i++){
            Integer count  = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr = newstr + str.charAt(i);
            if(count > 1){
                newstr = newstr + count.toString();
            }
        }
        System.out.println(newstr);
    }
}