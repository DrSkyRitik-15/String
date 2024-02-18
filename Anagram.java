import java.util.*;
class Anagram{
    public static void main(String[]args){
        String x="SILENT";
        String y="TENLIS";

        char a[]=x.toCharArray();   // converting string to array of characters  
        char b[]=x.toCharArray();   // converting string to array of characters  
        Arrays.sort(a);            // sorting the character array   
       
        Arrays.sort(b); //

        if (Arrays.equals(a,b)) {  //check ing whether both arrays are equal or not
            System.out.println("The two words are anagrams");
        } else {
            System.out.println("The two words are not anagrams");
    }
}
}