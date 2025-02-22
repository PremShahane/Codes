import java.util.*;
 class cahrat{
    public static void onebyone(String name){
        int n = name.length();
        for(int i=0;i<n;i++){
            System.out.println(name.charAt(i));
        }
    }

    public static void main(String args[]){
        String name = "prem";
        onebyone(name);
        
    }
 }