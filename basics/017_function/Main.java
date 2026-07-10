// A function is a code-block or segment that you could
// call to do a specific task.
//
// One caveat in Java is that we are not allowed to declare
// standalone functions like in other programming languages
// as Java is stricly object-oriented.

public class Main {
    // To further what is a function in Java, here is
    // an example of a function
    //
    // Keep these terms for now:
    // - `private` is used to define a class member could
    //   only be accessed by the class it self
    // - `static` is used to define a member that it belogs
    //   to the class itself
    //
    // This function must identify whether the argument `num`
    // is even.
    private static boolean isEven(int num) {
    if (num % 2 == 0){
      return true;
        }
     else
     {
     	return false;
     }
     
       
    }

    public static void main(String[] args) {
        System.out.println(isEven(33));
        System.out.println(isEven(50));
    }
}
