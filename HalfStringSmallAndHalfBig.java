public class HalfStringSmallAndHalfBig {
    public static void main(String[] args) {
        String str = "Hello World";
        String ss = " ";
        String bb = "";
        int n = str.length();

        System.out.println("String with letter : " + str);
        System.out.println("RemoveBracket");
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == ' ')
                continue;               //  remove all bractek from String
            else
                ss = ss + c;
        }
        System.out.println("String without bracket = \n" + ss);
        int len = ss.length();
        int halflen = len / 2; //11/2=5
        System.out.println("Half length of string = " + halflen);
        int seclen2=len-halflen; //11-5=6

        for (int j = 0; j < halflen; j++) {
            char d = str.charAt(j);

            bb += Character.toUpperCase(d);

        }
        for (int j = seclen2; j < len; j++) {
            char k = str.charAt(j);

            bb += Character.toLowerCase(k);

        }
        System.out.println("Final = \n " + bb);
    }
}
