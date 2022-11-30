package OOPs;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println("My age is " + this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vidwat";
        s1.age = 19;
        s1.printInfo();
    }
}
