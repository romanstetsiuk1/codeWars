package CamelCaseMethod;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseMethod {

    /*
    Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings.
    All words must have their first letter capitalized without spaces.

    For instance:

    camelCase("hello case"); // => "HelloCase"
    camelCase("camel case word"); // => "CamelCaseWord"
     */


    public static String camelCase(String str) {
        String result = "", tmp = "";

        String[] splitted = str.split(" ");

        List<String> strWithoutSpases = new ArrayList<>();

        for (int i = 0; i < splitted.length; i++) {
            if (!splitted[i].equals("")) {
                strWithoutSpases.add(splitted[i]);
            }
        }

        for (int i = 0; i < strWithoutSpases.size(); i++) {
            tmp = strWithoutSpases.get(i).substring(0, 1).toUpperCase() + strWithoutSpases.get(i).substring(1);
            result += tmp;
        }

        return result;
    }
}

//  Another way:

/*
public class Solution {
    public static String camelCase(String str) {
        // your code here
        String[] strings = str.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (String string : strings) {
            if (string.length()>0){
                stringBuilder.append(string.replaceFirst(string.substring(0, 1), string.substring(0, 1).toUpperCase()));
            }

        }
        return new String(stringBuilder);

    }
}
 */

//  OR:

/*
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static String camelCase(String str) {
        return (str == null || str.isEmpty())?"":Arrays.stream(str.trim().split("\\s+"))
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1,s.length()))
                .collect(Collectors.joining());
    }

}
 */
