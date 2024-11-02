interface  A {
    // int num = 6;
    void show();    
}

interface  C {
    void abc();
}

class B implements A, C {
    public void show() {
        System.out.println("Hello from B");
    }
    public void abc() {
        System.out.println("This is ABC");
    }
} 

public class InterfaceDemo 
{
    public static void main(String[] args) {
        // System.out.println(A.num);
        // B obj = new B();
        B obj = new B(); //or
        obj.show();  // This will call the show() method of B class
        obj.abc();
    }
}