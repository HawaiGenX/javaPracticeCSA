public class WrapperClassesExamples {
    public static void main(String[] args)

    {
        // CREATING INTEGER AND DOUBLE OBECTS
        // Creating Integer and Double objects from primitive values
        Integer intObj = Integer.valueOf(10); // Boxing
        Double doubleObj = Double.valueOf(15.75); // Boxing

        // Autoboxing (automatic conversion from primitive to wrapper object)
        Integer intAutoBoxed = 20;
        Double doubleAutoBoxed = 30.5;

        System.out.println("Integer Object: " + intObj); // Output: 10
        System.out.println("Double Object: " + doubleObj); // Output: 15.75
        System.out.println("Autoboxed Integer: " + intAutoBoxed); // Output: 20
        System.out.println("Autoboxed Double: " + doubleAutoBoxed); // Output: 30.5

        // Example 2: UNBOXING WRAPPER OBJECTS TO PRIMITIVE TYPES
        // Unboxing (automatic conversion from wrapper object to primitive)
        int intPrimitive = intObj; // Unboxing
        double doublePrimitive = doubleObj; // Unboxing

        System.out.println("Primitive int: " + intPrimitive); // Output: 10
        System.out.println("Primitive double: " + doublePrimitive); // Output: 15.75

        // xample 3: Parsing Strings to Primitive Values
        /*Parsing in Java refers to the process of converting
         a String into another data type, 
        such as an integer, double, or boolean. 
        This is especially useful when working with user inputs or 
        data from external sources (like files or APIs) that are often in String 
        format, but need to be used as numerical or other data types. */

        String intString = "50";
        String doubleString = "99.99";

        // Parsing strings to primitive types
        int parsedInt = Integer.parseInt(intString);
        double parsedDouble = Double.parseDouble(doubleString);

        System.out.println("Parsed Integer: " + parsedInt); // Output: 50
        System.out.println("Parsed Double: " + parsedDouble); // Output: 99.99

        // Example 4: Using Utility Methods and Constants
        // Integer class constants and utility methods
        int maxInt = Integer.MAX_VALUE; // Maximum value for int
        int minInt = Integer.MIN_VALUE; // Minimum value for int

        // Double class constants
        double maxDouble = Double.MAX_VALUE;
        double nanValue = Double.NaN;

        System.out.println("Max Integer: " + maxInt); // Output: 2147483647
        System.out.println("Min Integer: " + minInt); // Output: -2147483648
        System.out.println("Max Double: " + maxDouble); // Output: 1.7976931348623157E308
        System.out.println("NaN Value: " + nanValue); // Output: NaN

        // Example 5: Comparing Wrapper Objects
        Integer int1 = Integer.valueOf(100);
        Integer int2 = Integer.valueOf(100);
        Double double1 = Double.valueOf(45.6);
        Double double2 = Double.valueOf(50.3);

        // Using compareTo to compare values
        int intComparison = int1.compareTo(int2); // 0 (since 100 == 100)
        int doubleComparison = double1.compareTo(double2); // -1 (since 45.6 < 50.3)

        System.out.println("Integer Comparison: " + intComparison); // Output: 0
        System.out.println("Double Comparison: " + doubleComparison); // Output: -1

    }

}
