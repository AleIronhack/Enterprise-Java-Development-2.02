package org.example;

public class Main {
    public static void main(String[] args) {


    }

    public static int[] oddNumbers(int number){
        int[] oddArray = new int[(number + 1) / 2];
        int counter = 0;

        for(int i = 0; i <= number; i++){
            if(i % 2 != 0){
                oddArray[counter] = i;
                counter ++;
            }
        }

        return oddArray;
    }

    public static boolean forbiddenWords(String input){
        String[] inputArray = input.replace(",", "").split(" ");

        String[] wordList = {
                "abstract", "continue", "for","new", "switch",
                "assert", "default", "goto", "package",	"synchronized",
                "boolean", "do", "if", "private", "this",
                "break", "double", "implements", "protected", "throw",
                "byte",	"else",	"import", "public",	"throws",
                "case",	"enum",	"instanceof", "return",	"transient",
                "catch", "extends",	"int", "short",	"try",
                "char",	"final", "interface", "static",	"void",
                "class", "finally",	"long",	"strictfp",	"volatile",
                "const","float", "native", "super",	"while"
        };

        for(String i : inputArray){
            for(String j : wordList){
                if(i.equals(j)) return true;
            }

        }
        return false;
    }
}