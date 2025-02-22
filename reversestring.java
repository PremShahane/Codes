import java.util.*;
 
 class reversestring{
    public static void main(String args[]){
        String name ="prem";
        String rev = "";
        int n = name.length();
        for(int i=0;i<n;i++){
        rev=name.charAt(i)+rev;
        }
        System.out.println(rev);
    }
 }
 