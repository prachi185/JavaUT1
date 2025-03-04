// Class demonstrating different access modifiers
class AccessModifiersExample {

    // Public variable: Accessible from any class
    public int publicVar = 10;

    // Private variable: Accessible only within this class
    private int privateVar = 20;

    // Protected variable: Accessible within the same package and subclasses
    protected int protectedVar = 30;

    // Default (package-private) variable: Accessible within the same package
    int defaultVar = 40;

    // Public method: Accessible from any class
    public void publicMethod() {
        System.out.println("Public method can be accessed from anywhere.");
    }

    // Private method: Accessible only within this class
    private void privateMethod() {
        System.out.println("Private method can only be accessed within this class.");
    }

    // Protected method: Accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected method can be accessed within the same package or by subclasses.");
    }

    // Default (package-private) method: Accessible only within the same package
    void defaultMethod() {
        System.out.println("Default method can be accessed within the same package.");
    }

    public void showValues() {
        // Accessing all members inside the same class
        System.out.println("Public variable: " + publicVar);
        System.out.println("Private variable: " + privateVar);
        System.out.println("Protected variable: " + protectedVar);
        System.out.println("Default variable: " + defaultVar);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing public members (accessible from anywhere)
        System.out.println("Public variable: " + example.publicVar);
        example.publicMethod();

        // Accessing protected members
        System.out.println("Protected variable: " + example.protectedVar);
        example.protectedMethod();

        // Accessing default members (within the same package)
        System.out.println("Default variable: " + example.defaultVar);
        example.defaultMethod();

        // Accessing private members is not allowed directly from outside the class
        // Uncommenting the following line would cause a compilation error
        // System.out.println("Private variable: " + example.privateVar); // Error
        // example.privateMethod(); // Error

        // We can, however, access private members within the same class, for example:
        example.showValues();
    }
}
