// abstract class Computer {
//     public abstract void compile();
// }
interface Computer {
    void compile();
}


// class Laptop extends Computer {
//     public void compile() {
//         System.out.println("you got 5 errors");
//     }
// }

class Laptop implements Computer {
    public void compile() {
        System.out.println("you got 5 errors");
    }
}


// class Desktop extends Computer {
//     public void compile() {
//         System.out.println("you got 5 errors, faster than laptop");
//     }
// }
class Desktop implements Computer {
    public void compile() {
        System.out.println("you got 5 errors, faster than laptop");
    }
}

// class Developer {

//     public void buildApp(Laptop l) {
//         System.out.println("Building App");
//         l.compile();
//     }
// }

class Developer {

    public void buildApp(Computer l) {
        System.out.println("Building App");
        l.compile();
    }
}

public class NeedInterface {
    public static void main(String[] args) {
        Computer l = new Desktop();
        // Desktop l = new Desktop();
        // Laptop l = new Laptop();
        Developer d = new Developer();
        d.buildApp(l);
    }
}
