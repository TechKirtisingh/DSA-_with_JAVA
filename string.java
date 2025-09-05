// String : is a sequence of characters enclosed in double quotes(" ").
// properties of string :
// 1. String is immutable : once a string is created its value cannot be changed.
//2. stored in heap memory.(string pool)
//3. string operator : str1+str2  or  str1.concat(str2) : to concatenate two strings 
    // str.length() : to find length of string
    // str.charAt(index) : to find character at given index
    // str.substring(startIndex, endIndex) : to extract substring from given string
    // str.toLowerCase() : to convert string to lowercase
    // str.toUpperCase() : to convert string to uppercase
    // str.trim() : to remove leading and trailing spaces (remove extra spaces)
    // str.replace(oldChar, newChar) : to replace old character with new character
    // str.equals(anotherString) : to compare two strings (case sensitive)
    // str.equalsIgnoreCase(anotherString) : to compare two strings (case insensitive)

public class string{
    public static void main(String[] args) {
        //1.length of string 
        String str1 = "Java";
        System.out.println("length of \""+str1+"\" \u2192 " +str1.length());

        //2.concat
        String str2 = "Hello";
        String str3 = "World";
        System.out.println("\""+ str2 + "\" + \"" + str3 + "\" \u2192 " +(str2+str3));
        System.out.println("using concat(): " + str2.concat(str3));

        //3. character at index:
        System.out.println("\""+ str1 + "\".charAt(2)  \u2192 " + str1.charAt(2));

        //4. substring
        String str4 = "Programming";
        System.out.println("\""+ str4 + "\".substring(1,4) \u2192 " +str4.substring(1,4));

        //5. Uppercase conversion
        String str5 = "java";
        System.out.println("\""+ str5 + "\".toUpperCase() \u2192 " +str5.toUpperCase());

        //6. Lowercase conversion
        String str6 = "HELLO";
        System.out.println("\""+ str6 + "\".toUpperCase() \u2192 " +str6.toLowerCase());

        //7. Remove spaces
        String str7 = "   Welcome to Java  ";
        System.out.println("Before trim: \""+ str7 + "\"");
        System.out.println("After trim: \""+ str7.trim() + "\"");

        //8. Replace character
        System.out.println("\"Java\".replace('a','o') \u2192 " + "Java".replace('a','o'));

        //9.Equal comparison
        System.out.println("\"java\".equals(\"java\")\u2192 " + "java".equals("java"));
        System.out.println("\"java\".equals(\"Java\")\u2192 " + "Java".equals("java"));

        //10.ignore case equality
        System.out.println("\"java\".equalsIgnoreCase(\"Java\")\u2192 " + "java".equalsIgnoreCase("Java"));
    }
    
}
























