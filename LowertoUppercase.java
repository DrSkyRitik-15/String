public class LowertoUppercase {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original string: " +"\n"+ str);
        
    
        String lowerStr = str.toLowerCase();
        System.out.println("\nConverting all characters to lower case : " + lowerStr);
        
        String upperStr = lowerStr.toUpperCase();
        System.out.println("\nConverting all characters to upper case : "+ "\n" +upperStr);
    }
}
