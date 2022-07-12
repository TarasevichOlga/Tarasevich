/*
Data types, wrapper classes, arrays.
In the main method, create variables of primitive types and translate these variables into wrapper classes (e.g., from int to Integer and vice versa).
Create an array of strings, fill it with values, and print the array's length and all elements into the console.
*/

package task1;

public class FirstTask {
    public static void main(String[] args) {
        String a = "113";

        int b = Integer.parseInt(a);

        System.out.println(b);
    }
}