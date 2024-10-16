/*In java we have two types of data
 * 1. Primitive data
 * 2. reference data
 * Under Primitive data we have four type of data
 * Integers, floating point, boolean, Characters
 * integers are whole numbers,
 * Under integers we have 4 types
 * 1. byte
 * 2. short
 * 3. int
 * 4. long 
 * floating point are decimal numbers
 * Under floating point we have only two kinds
 * 1. float
 * 2. double
 * boolean: This is just true and false statements
 */
//In this lesson we are going to use only int, double, and boolean.

public class VariblesAndDataTypes{
    public static void main(String[]args){
        //Creating space/container to store data
        //this action is known as Initialization
//   int myNumber;  //initialization
//   myNumber = 6;  //Assig\nment

    int myNumber = 6;  //Initializan and assignment
    int myNumber1 = 7;
    int sum = myNumber + myNumber1;
    double myDecimal = 4.7;
    int x = 11;
    int y = 7;
    boolean isGreaterThan = y > x;
    System.out.println(sum);
    System.out.println(myDecimal);
    System.out.println(isGreaterThan)
    }
}