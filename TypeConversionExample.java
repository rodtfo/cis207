public class TypeConversionExample {

    public static void main(String[] args) {

        // Implicit Type Conversion (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int is automatically converted to double
        System.out.println("Implicit Conversion (int to double): " + doubleValue);

        // Explicit Type Conversion (Narrowing)
        double pi = 3.14159;
        int intPi = (int) pi; // Explicitly casting double to int
        System.out.println("Explicit Conversion (double to int): " + intPi);

        // Converting int to string
        int num = 50;
        String strNum = Integer.toString(num);
        System.out.println("Integer to String: " + strNum);

        // Converting string to int
        String str = "200";
        int strToInt = Integer.parseInt(str);
        System.out.println("String to Integer: " + strToInt);
    }
}
