public class StringValueOfExample {
    public static void main(String[] args) {
       // Example with int
        int intValue = 42;
        String stringValueInt = String.valueOf(intValue);
        System.out.println("String representation of int: " + stringValueInt);

        // Example with double
        double doubleValue = 3.14;
        String stringValueDouble = String.valueOf(doubleValue);
        System.out.println("String representation of double: " + stringValueDouble);

        // Example with boolean
        boolean booleanValue = true;
        String stringValueBoolean = String.valueOf(booleanValue);
        System.out.println("String representation of boolean: " + stringValueBoolean);

        // Example with char
        char charValue = 'A';
        String stringValueChar = String.valueOf(charValue);
        System.out.println("String representation of char: " + stringValueChar);

        // Example with Object
        Object objValue = new Object();
        String stringValueObject = String.valueOf(objValue);
        System.out.println("String representation of Object: " + stringValueObject);
    }
}
