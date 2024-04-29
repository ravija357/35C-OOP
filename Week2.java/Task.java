import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        // task1
    int variable=10, bane=18;
    System.out.println("greater than 18" + (variable >= bane));  
    
    // task2
    int si, t=3, r=2 ,p=20000;
    si=(t*p*r)/100;
    System.out.println(si);

    //tasks 3
    int a, pi,l=10,b=20;
    a=l*b;
    pi=2*(l*b);
    System.out.println("area is" + a);
    System.out.println("perimenter is" + pi); 

    //task 4;
    int output ,number1=20, number3=30;
    output=number3>number1 ? 20 : 10;
    System.err.println(output);

   //5 Write a program to take two integer inputs from the user and print the sum and product of them.
   int q=10,u=20;
   System.out.println("the sum is" + (q+u));
   System.out.println("the sum is" + (q*u));

 // 6 Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
int ba=20,ab=30,sum,su,div;
sum=ba+ab;
su=ba*ab;
div=su/sum;
System.out.println("division is" + div);

//7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
  Scanner scan= new Scanner(System.in); //System.in is used as input
        System.out.println("what is ur name");
        String name=scan.nextLine();
        
        System.out.println("what is ur roll no");
        int roll= scan.nextInt();
      
        System.out.println("ur field of interest");
        String field=scan.next();
        System.out.println("my name is" + name);
        System.out.print("my roll no is" + roll);
        System.out.println("my field of interset is" + field);
         // 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
       System.out.println("what is side of square");
       int sq=scan.nextInt();
       int area=sq^2,perimeter=sq*2,ptr=sq+sq+sq/3,aarea=1/2*sq,cube=sq^2,cubiod=2*(sq+sq);
       System.out.println("area" + area);
       System.out.println("perimeterr" + perimeter);
       System.out.println("si" + ptr);
       System.out.println("area of  triangle" + aarea);
       System.out.println("volume of cube" + cube);
       System.out.println("volume of cubiod" + cubiod);
         scan.close();

/*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */




    }
}
    }

}
