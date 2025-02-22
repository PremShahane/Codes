import java.util.*;

class substringfunction{

    public static String substring(String name,int si ,int ei){
        String sub ="";
        for(int i=si;i<ei;i++){
            sub += name.charAt(i);
        }
        return sub;

    }
    public static void main(String args[]){
        String name ="premshahane";
        System.out.println(substring(name,0,4));

    }
}