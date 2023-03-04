
class Student {

    private String name;
    private int age;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}

public class Encapsulation {
    public static void main(String args[]) {
        Student student = new Student();
        student.setName("Leon");
        student.setAge(24);
        student.setRole("Full Stack Web Developer");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRole());
    }
}
