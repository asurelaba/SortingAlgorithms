/*
 * Class HelloUser prints the user name that is passed to main method through command line.
 *
 * @version 1.0 12 Apr 2023
 * @author Ashwini Suresh
 * */
public class HelloUser {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.print("Hello ");
            for (String name : args) {
                System.out.print(name + ' ');
            }

        } else {
            System.out.println("Hello user");
        }

    }
}
