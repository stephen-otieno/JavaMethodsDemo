import java.util.Scanner;

class Demo1 {

    static String displayGreetings(String name) {
        System.out.println("Hello " + name);
        return name;

    }

     //  Checking if the number provided by the user is even

    static boolean isEven(int num1) {
        return num1 % 2 == 0;

    }
    

    // Calculating the square of the provided number

    static int calcSquare(int num1) {
        int square = num1 * num1;
        return square;

    }

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter value of num1: ");
        int num1 = input.nextInt();

        
        // invoking the displayGreetings() method
        displayGreetings(name);

         // calling the isEven() method
        System.out.println("Is " + num1 + " even? " + isEven(num1));


        // calling the calcSquare() method
        System.out.println("The square of "+num1+  " is: " + calcSquare(num1));

       





        input.close();

        


    }


}