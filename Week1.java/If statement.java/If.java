package If statement.java;

public class If {
    public static void main(String[] args) {
        /*simple if statemnt, takes condition/expression with boolean value */
        if (true){
            System.out.println("True statement");

        }
        if (false){
            System.out.println("Skipped statement");

        }
        /*If condition fails, goes to else block/scope */
        int num1 = 10, num2 = 20;
        if (num1 > num2){
            System.out.println("Num1 is greater");
        }else{
            System.out.println("Num2 is greater");

        }
        /*if else if */
        int iNum1=10, iNum2=10;
        if(iNum1 == iNum2){
            System.out.println("Equal number");
        }else if (iNum1 < iNum2){
            System.out.println("iNum is less");
        }else{
            System.out.println("Default execution if all fails");
        }
        /*Note that else is not mandatory and can be skipped */
        /*Question */
        int q1=10,q2=10;
        if(q1 >= q2,){
            System.out.println("1st statement");
        }else if(q1 == q2){
            System.out.println("nNum1 is negative and greater");
        }else{
            System.out.println("nNum1 is negative and lesser");
        }else{
            if (nNum1 > nNum2){
                System.out.println("nNum1 is positive and greater");
            }else{
                System.out.println("nNum1 is positive and lesser");
            }
        }
    }
}


/*Task
 * Given the value below, add the total and take the average
 * if any of the marking is less than 35, print "Fail"
 * if average is less than 60, print"3rd div"
 * if average is less than 70, print "2nd div"
 * if average is less than 80, print "1st div"
 * if average is greater than or equal to 80, print "distintion"
 */
int main = 38, science=60, english=35;
/*make total variable and average variable */