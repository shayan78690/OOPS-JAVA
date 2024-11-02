interface Car {
    void drive();
}


public class AnnonymousInner {
    public static void main(String[] args) {
        Car obj = new Car()
        {
            public void drive() {
                System.out.println("Driving..");
            }
        };
        obj.drive();
    }
}
