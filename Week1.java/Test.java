
/*
 * 1. Write a program that prints Hello World! to the console. Save the program as Hello.java.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World")

/* 2. Extend/Modify the above program to print two additional lines:
This is my first program
I am on module ST4003CEM
System.out.print (not println) and produces the same output. */

System.out.println("this is my first program");
System.out.println("i am on module ST400CEM");

/* 3. Write a program that prints the following output:

A "quoted" String is

'much' better if you learn

the rules of "escape sequences."

Also, "" represents an empty

String. Don't forget: use \"

instead of " !

'' is not the same as " */
System.out.println("\\helloworld\nend\"yay");


/* 4. WAP that prints the following pattern:

*
**
***
****
*/  
System.out.println("*\n**\n***\n****\n******");


/*   5. WAP prints the following pattern:

*********

*********

*********

*********
    */
    System.out.println("*****\n*****\n*****\n*****\n******");


/*6.WAP that prints the following output:

A well-formed Java program has a main method with { and } braces.



A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.

(But we type \" instead!)

What is the difference between

a ' and a "?  Or between a " and a \"?



One is what we see when we're typing our program. The other is what appears on the "console."/* */


         System.out.println("A well-formed Java program has a main method with { and } braces.");
        System.out.println();
        System.out.println("A System.out.println statement has ( and ) and usually a String that starts and ends with a \" character.");
        System.out.println();
        System.out.println("(But we type \\\" instead!)");
        System.out.println();
        System.out.println("What is the difference between");
        System.out.println("a ' and a \"?  Or between a \" and a \\\"?");
        System.out.println();
        System.out.println("One is what we see when we're typing our program. The other is what appears on the \"console.\"");


}

}