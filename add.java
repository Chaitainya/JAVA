
class Calculate {
    public int add(int x, int y) {
        return x + y;
    }
}

public class add {
    public static void main(String args[]) {
        System.out.println("main called");

        Calculate addition = new Calculate();
        int addition_result = addition.add(3, 9);

        System.out.println(addition_result);
    }
}