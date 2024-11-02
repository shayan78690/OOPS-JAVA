public class ExceptionalExample2 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        int arr[] = {1, 2, 3, 4, 5};

        try 
        {
            result =  num1 / num2;
            System.out.println(arr[7]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide the number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be in your limits");
        }
        catch(Exception e) 
        {
            System.out.println("Something went wrong...");
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}
