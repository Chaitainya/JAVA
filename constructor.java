
class HelloWorld {

    String name;
    String role;

    public HelloWorld(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void getUserDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
    }
}

public class constructor {
    public static void main(String args[]) {
        HelloWorld user = new HelloWorld("Leon", "Full Stack Developer");
        user.getUserDetails();
    }
}