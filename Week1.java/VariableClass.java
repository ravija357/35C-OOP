

public class VariableClass {
    public static void main(String[] args) {
        /* */
        byte byteVariable;
        /*Initialization */
        byteVariable = 100;
        /*Declaration and Initialization */
        short shortVariable = 1000;
        /*Multiple Declaration */
        int intVariable1, intVariable2;
        /*Initialization */
        intVariable1 = 10;
        intVariable2 = -10;
        /*Multiple Declaration and Initialization */
        long longVariable1 = 100000, longVariable2 = -199999;
        float floatVariable = 1.89f; // the letter 'f' is required
        double doubleVariable = 189.8923d; // the letter 'd' is optional
        char charVariable = 'c' ; // Single letter enclosed in single quotation
        boolean booleanVariable = true; // small case true/false
        /*Illegal actions */
        // byteVariable = 20; // cannot redeclare a variable
        //byteVariable = 30; // instead use reassignment
        // boolean boolVar2 = 'false'; // should match the exact datatype
        // byte byteVariable2 = 100000; // cannot exceed  in or max

        //* Non-Primitive  data type */
        String StringVarible = "This is a string"; // use double quotation""
        /* Or use the class */
        String stringVariable2 = new String(original:"String using class");
        /*Class/Object */
        VariableClass variableObject = new VariableClass();
        /*Use the same class Name as specified in public class <ClassName> */
    }
}
