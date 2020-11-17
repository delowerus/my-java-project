package input_output;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        //create an object of scanner class
        Scanner s = new Scanner(System.in);

        //Enter string as keyboard input
        String  myLine = s.nextLine();

        //Enter an integer as keyboard input
        int a = s.nextInt();
        int b = s.nextInt();

        //Print the output
        System.out.println(myLine);
        System.out.println(a+b);

    }

}
