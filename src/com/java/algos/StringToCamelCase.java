package com.java.algos;

//Method that converts dash/underscore delimited words into camel casing.
//The first word within the output should be capitalized only if the original word was capitalized
//(known as Upper Camel Case, also often referred to as Pascal case).

public class StringToCamelCase {
    public static String toCamelCase(String s){
        int i =0;
        char[] x = s.toCharArray();
        for(char c : x){
            if((c == '_' || c == '-'))
                x[i + 1] = Character.toUpperCase(x[i + 1]);
            i++;
        }
        return new String(x).replaceAll("[-,_]([A-Z])", "$1");
    }
}
