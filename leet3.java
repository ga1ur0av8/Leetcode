package Leetcode;
public class leet3 {
    public static void main(String arg[]){
        String str = "ABCABCDABC";
        int count = 0 ; 
        String s = "";
        int maxl = 0 ;
        for(int i =0 ; i< str.length();i++){
            if(!s.contains(String.valueOf(str.charAt(i)))){
                s+= str.charAt(i);
                if(maxl < s.length()){
                    maxl= s.length(); 
                }
            }else{
                s="";
                i = count++;
            }
        }
        System.out.println(maxl);
    }
}
