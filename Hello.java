/**
 * This class demonstrates how to use the command line arguments to pass
 * information to the main method.
 * 
 * Below are sample terminal commands to compile and run the file from a terminal. 
 * The file path may be different on other computers. 
 * PS C:\Users\dlakind\examples> javac Hello.java
 * PS C:\Users\dlakind\examples> java Hello Mr. Lakind
 * Hello Mr. Lakind!
 */

public class Hello 
{
    public static void main(String[] args) {

        System.out.println("Hello " + args[0] +" " + args[1] + "!");
    }    
}
