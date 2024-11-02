@FunctionalInterface
interface Car {
    void drive(int avg);
}

public class LambdaExp {
    public static void main(String[] args) {
        // Car obj = () -> System.out.println("Driving..");
        // {
        //     System.out.println("Driving..");
        // };

        // Car obj = new Car() {
        //     public void drive(int avg) {
        //         System.out.println("Running car at average " + avg);
        //     }
        // };
        // Car obj = (int avg) -> System.out.println("Running car at average " + avg);
        Car obj = avg -> System.out.println("Running car at average " + avg);



        obj.drive(16);
    }
}
