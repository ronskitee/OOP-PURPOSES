// Like any other compiled programming language Java has different types of errors
// 
// Types of Errors
//      1. Compilation Errors -- Occurs when syntax is incorrect.
//      2. Run-time Errors -- Your code compiles, but it crashes during execution. (e.g. Division by zero, out of bounds, and null pointer exceptions).
//      3. Logical Errors -- Output is incorrect because of a logic flaw.
// 
// `try-catch` blocks are used to gracefully handle exeptions during runtime. It would always be ideal to wrap your risky code in addition to using
// input validation, null checks, and other safeguards.
//
// When an error is thrown in Java, it is wrapped in Exception classes.
//
//      try {
//          your code goes here
//      } catch (Exception e) {
//          handle exception
//      }
//
public class Main {
    public static void main(String[] args) {
       try {
            int n = 10 / 0;
        
            System.out.print("Output" + n);
        } catch (Exception e) {
            System.out.println (e.getMessage()); // <-- print the error message we got here. make sure to have a new line after
        }
    }
}
