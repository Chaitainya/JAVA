
class Student {
    String name;
    int age;
    String role;
}

public class StringArrayForEach {
    public static void main(String args[]) {
        Student n1 = new Student();
        n1.name = "Leon";
        n1.age = 26;
        n1.role = "Full Stack Developer";

        Student n2 = new Student();
        n2.name = "Aditya";
        n2.age = 24;
        n2.role = "Front-end Developer";

        Student n3 = new Student();
        n3.name = "Gandhi";
        n3.age = 40;
        n3.role = "Android Developer";

        Student Students[] = new Student[3];
        Students[0] = n1;
        Students[1] = n2;
        Students[2] = n3;

        for (Student n : Students) {
            System.out
                    .println("Name: " + n.name + ", " + "Age: " + n.age + ", " + n.role);
        }
    }
}
