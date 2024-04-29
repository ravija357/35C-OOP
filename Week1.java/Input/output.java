package Input;

import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        /*Print/Output a line with line break
         * use "sout" short shortcut
         */
        System.out.println("This prints and breaks line");
        /*Print the word without line break */
        System.out.print("This will not break line");
        System.out.print("This line will continue\n");

        /*Output formating
         * System.out.printf();
         * %s string, %d intergral, %f floating point, %b boolean
         * This will not break line too
         */
        System.out.printf("The next word is %s", "New word");
        System.out.printf("This next int is %d", 10);
        /*you can use multiple formatter */
        System.out.printf("Multiple %f %b", 10.9f,false); 
        
        
        /*User Input using Scanner
         * first import the scanner class
         * import java.util.scanner; class
         * import java.util.scanner; // at the top of the file
         */
        Scanner scan = new Scanner(System.in); //System.in is used as input
        System.out.println("The following takes one word from sentence");
        String oneWord = scan.next();
        System.out.println(oneWord);
        System.out.println("The following takes whole sentence");
        String wholeSentence = scan.nextLine();
        System.out.println(wholeSentence);
        System.out.println("The following takes int");
        int intInput = scan.nextInt();
        System.out.println(intInput);
        System.out.println("The follwing takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println(booleanInput);
        scan.close();


        /*task
         * Create a new Scanner obj name scan1
         * prompt user for the following
         * What is your name? Save to String name, use nextLine()
         * How many siblings do you have ? Save int sibling, use nextInt()
         * Print the output
         * Hello, name
         * Over 18 status,
         * You have sibling number of siblings
         */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean status = scan1.nextBoolean();
        System.out.println("Hello,"+ name);
        System.out.println("name");
    }
}
