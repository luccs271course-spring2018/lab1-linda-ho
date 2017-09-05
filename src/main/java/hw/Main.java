package hw;

public class Main {

    public static void main(String[] args) {
        int num = 0;

         try {
             // Try to change string into an int
             num = Integer.parseInt(args[0]);
         } catch (NumberFormatException err) {
             System.out.println("Argument must be an integer");
             //Exit due to an error
             System.exit(1);
         }

         FizzBuzz.printResult(num);
    }
}
