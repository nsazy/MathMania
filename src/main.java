import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i = 0;
        String emptyString = "";
        String emptyStringWithSpaces = " ";
        int numChoice = 0;
        int answer = 0;
        int userChoice = 0;
        int userAddChoice = 0;
        int userInput = 0, notInt = 0;
        int userEntry;
        boolean run = true;
        int newInput = 0;
        while(run) {
            Scanner choice = new Scanner(System.in);
            System.out.println("Welcome to Math Mania");
            System.out.println("Addition press 1");
            System.out.println("Subtraction press 2");
//            System.out.println("Multiplication press 3");
//            System.out.println("Division press 4");
            System.out.println("To quit, enter 5");
            System.out.println("Please enter a choice: ");

                while (choice.hasNext()) {

                       boolean input = choice.hasNextInt();
                       if (input == true) {
                           userChoice = choice.nextInt();
                           //run = false;

                           if (userChoice > 0) {

                               if (userChoice == 1) {
                                   System.out.println("To do single digit addition, enter 1");
                                   System.out.println("To do double digit addition, enter 2");
                                   System.out.println("To do triple digit addition, enter 3");
                                   while (choice.hasNext()) {
                                       userAddChoice = choice.nextInt();
                                       break;
                                   }
                                   if (userAddChoice == 1) {
                                       Addition.singleDigitAddition();
                                   }
                                   if (userAddChoice == 2) {
                                       Addition.doubleDigitAddition();
                                   }
                                   if (userAddChoice == 3) {
                                       Addition.tripleDigitAddition();
                                   }

                               }
                               if (userChoice == 2) {
                                   System.out.println("To do single digit subtraction, enter 1");
                                   System.out.println("To do double digit subtraction, enter 2");
                                   System.out.println("To do triple digit subtraction, enter 3");
                                   while (choice.hasNext()) {
                                       userAddChoice = choice.nextInt();
                                       break;
                                   }
                                   if (userAddChoice == 1) {
                                       Subtraction.singleDigitSubtraction();
                                   }
                                   if (userAddChoice == 2) {
                                       Subtraction.doubleDigitSubtraction();
                                   }
                                   if (userAddChoice == 3) {
                                       Subtraction.tripleDigitSubtraction();
                                   }

                               }
                               if (userChoice == 5) {
                                   System.exit(1);

                               }

                           } else {
                               System.out.println("Please enter a number from the menu.");
                           }
                       }else{
                           System.out.println("You did not enter a number.  Please enter a number.");
                       }

                    break;
                    }//end while

        }//end while

    }//end main


}//end class




