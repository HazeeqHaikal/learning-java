class variables{
    public static void main(String[] args){
        // integer types
        byte aSingleByte = 127; // -128 to 127
        short aSmallNumber = 32767; // -32768 to 32767
        int anInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        // decimal types
        double aDouble = 1.7976931348623157E308; //4,9E-324 to 1,8E308
        float aFloat = 3.4028235E38F;  //1,4E-45 to 3,4E38

        // booleans
        boolean isWeekend = false;
        boolean isWeekday = true;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println("This is the copyright symbol: " + copyrightSymbol);

        System.out.println();

        int number1 = 5;
        double number2 = number1;
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);

        // int to double is allowed

        System.out.println();

        // double num1 = 5;
        // int num2 = num1;

        // System.out.println("num1: " + num1);
        // System.out.println("num2: " + num2); double to int is not allowed

        double num1 = 5.8;
        int num2 = (int) num1;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2); // double to int is allowed with casting
    }
}