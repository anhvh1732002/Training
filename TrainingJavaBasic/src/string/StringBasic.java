package string;

public class StringBasic {
    public static void main(String[] args) {
        // *init String by using string literal
        //Save => pool
        String s = "This is a string";
        //Check in pool:if existed => won't create a instance
        String s1 = "This is a string";
        //Only one string object "This is a string" is created. s and s1 are referenced to this string object

        // *init String by using new key
        String s2 = new String("This is a string with new key");
        // 1 object is created => save to HEAP, variable s2 is referenced to object save to HEAP

        char[] ch = { 's', 't', 'r', 'i', 'n', 'g', 's' };
        String s3 = new String(ch); //convert list char to string
        String s33 = new String(ch);
        System.out.println(s3 == s33); //false
        System.out.println(s3.equals(s33)); //true

        //Some methods of string
        System.out.println(s3.length()); //length of string
        System.out.println(s3.charAt(0)); //value of a specific position
        String s4 = String.format("name is %s", s3); //format string
        System.out.println(s4);
        //substring
        System.out.println(s4.substring(5));
        System.out.println(s4.substring(0,4));
        //check if string contains char sequence
        System.out.println(s4.contains("st"));
        //connect 2 string by using concat
        System.out.println(s4.concat(s3));
    }
}
