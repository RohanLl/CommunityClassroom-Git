class A {
    int x = 10, y = 5;

    @Override
    public String toString() {
        return "Sum = " + (x + y);
    }
}

public class ten {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.toString());
    }
}