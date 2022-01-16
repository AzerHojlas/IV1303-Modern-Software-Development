public class calculator {

    public static void main (String[] args) {
        
       int integer1;
       String operator;
       int integer2;
       double output;

       try {
        Integer.parseInt(args[0]);
       } catch (NumberFormatException num1) {
           System.out.println("Error, argument 1 is not an integer");
           System.exit(1);
       }

       try {
        Integer.parseInt(args[2]);
       } catch (NumberFormatException num1) {
           System.out.println("Error, argument 3 is not an integer");
           System.exit(1);
       }

       try {
           if ((!args[1].equals("/")) && (!args[1].equals("*")) && (!args[1].equals("+")) && (!args[1].equals("-")))
            throw new Exception();
       } catch (Exception op) {
           System.out.println("Error, argument 2 is not a valid operator");
           System.exit(1);
       }

       integer1 = Integer.parseInt(args[0]);
       operator = args[1];
       integer2 = Integer.parseInt(args[2]);

       try {
           if (args[1].equals("/") && (integer2 == 0))
            throw new ArithmeticException();
       } catch (ArithmeticException ar) {
           System.out.println("Error, division with 0 is not allowed");
           System.exit(1);
       }

       if (args[1].equals("/")) {
            output = (double) integer1 / integer2;
            System.out.println(output);
       }

       if (args[1].equals("*")) {
            output = (double) integer1 * integer2;
            System.out.println((int) output);
       }

       if (args[1].equals("-")) {
            output = (double) integer1 - integer2;
            System.out.println((int) output);
       }

       if (args[1].equals("+")) {
            output = (double) integer1 + integer2;
            System.out.println((int) output); 
       }
   
    }
}