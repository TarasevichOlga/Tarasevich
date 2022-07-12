package task3;

public class Program {

    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "ISsoft");
        sam.display();  // Sam
        // Works in Microsoft
        sam.r1();
        //responsibilities - requirements analysis
        };

    }
 class ManualQA implements Work {

     String name;
     public String getName(){ return name; }

     public ManualQA (String name) {

         this.name = name;
     }
    public void r1() {
        System.out.println("requirements analysis");
    }
    public void r3() {
        System.out.println("risk assessment");
    }
    public void r4() {
        System.out.println("planning the testing process");
    }
    public void r5() {
        System.out.println("work with test documentation");
    }
    public void r6() {
        System.out.println("product testing");
    }
    public void r7() {
        System.out.println("documentation of defects");
    }
    public void display() {
        System.out.println("communication with managers and business analysts");
    }
    // Driver Code

}

abstract class AutomateQA implements Work {

    private String name;

    String getName(){
        return name;
    }

    AutomateQA(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }

    @Override
    public void r4() {

    }

    @Override
    public void r5() {

    }
}
        class Employee extends ManualQA {
            String company;
            public Employee(String name, String company) {

                super(name);
                this.company = company;
            }
            @Override
            public void display() {

                System.out.printf("Name: %s \n", getName());
                System.out.printf("Works in %s \n", company);

            }
        }