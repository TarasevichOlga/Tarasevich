package task5;

/*
**The String class and its methods for working with strings. **
Create several Strings in the main method.
Find if a String starts with a specific letter.
Find if a String contains particular words.
*/

public class Example {

    public static void main(String[] args) {
        String str1 = "The last 100 years have seen an amazing human triumph of technology.";
        String str2 = "Diseases that once killed and paralyzed are routinely treated or prevented - or even eradicated entirely, as with smallpox";
        String result = str1 + " " + str2;

        boolean isContain1 = result.startsWith("last");
        System.out.println(isContain1);
        System.out.println("Символ \"Diseases that\" присутствует в строке str? Ответ: " + result.contains("Diseases that"));
    }
}

