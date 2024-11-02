class Person {
    public void show() {
        System.out.println("in show");
    }
    // class Adress {
    //     public void display() {
    //         System.out.println("in display");
    //     }
    // }
    static class Adress {
        public void display() {
            System.out.println("in display");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.show();

        Person.Adress a = new Person.Adress();
        a.display();
        
    }
}
