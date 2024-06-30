import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you want a Car?");
        Scanner scan = new Scanner(System.in);
        String Ans1 = scan.next();

        if (Ans1.equals("yes")){
            System.out.println("What is your favourite color (Red,Blue,White)");
            String Ans2 = scan.next();

            if (Ans2.equals("red")){
                System.out.println("We have it in store.Would you like to check it out?");
                String Ans3 = scan.next();

                if (Ans3.equals("yes")){
                    System.out.println("Great! Lets check the car.");
                }
            }
            else if (Ans2.equals("blue")) {
                System.out.println("We can order it.");
            } else if (Ans2.equals("white")) {
                System.out.println("We are yet to Import the car");
            }
        }
        else {
            System.out.println("Thank you for your time. Hava a good day");
        }
    }
}