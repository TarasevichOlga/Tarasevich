/*
Pick an object in your room and create a class for it.
Add multiple constructors.
Fill the class with fields and methods that describe its properties and behavior.
Add getters and setters for fields.
Create another class with the main method and create an object of this type, fill in the fields, and call the object's methods.
Add a static method to the class and call it in the main method using the class name.
*/

package task2;

public class Plant {
    String name;
    String kind;
    int age;

    Plant(){
        name = "Zhorik";
        kind = "eucharis";
        age = 2;
    }
    public static void main(String args[]){
        Plant obj = new Plant();
        System.out.println(obj.name);
        System.out.println(obj.kind);
        System.out.println(obj.age);
    }
}