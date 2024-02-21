import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Subtraction {
    public static void singleDigitSubtraction(){
        
        final int PROBLEMS = 10;
        Random rand  = new Random();
        Scanner saAnswer = new Scanner(System.in);
        int sDChoice = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        float scorrectAnswers = 0.0F;
        String corrAnswers;

        for (int i = 0; i < 10; i++) {
            int sdsa = rand.nextInt(1, 10);
            int sdsb = rand.nextInt(1, 10);
            int sdsc;
            if (sdsa > sdsb) {
                sdsc = sdsa - sdsb;
                //System.out.println("Answer is" + sdsc);
                System.out.println("Number " + (i + 1));
                System.out.println(" " + sdsa);
                System.out.println("-" + sdsb);
                System.out.println(" _");
            } else {
                sdsc = sdsb - sdsa;
                //System.out.println("Answer is" + sdsc);
                System.out.println("Number " + (i + 1));
                System.out.println(" " + sdsb);
                System.out.println("-" + sdsa);
                System.out.println(" _");
            }
            while(saAnswer.hasNext()){
                sDChoice = saAnswer.nextInt();
                break;
            }
            if (sDChoice == sdsc){//check if user answer equals system answer
                System.out.println("You got it right, good job!");
                values.add(sDChoice);
            }
        }//end for loop
        if (values.size() == 0){
            System.out.println("Sorry, no answers were correct.  Please try again.");
        }
        else{
            int arrayLength = values.size();
            //scorrectAnswers = (arrayLength /3) * 100;
            //float answers = Math.round(scorrectAnswers);
            //PercentageCorrect.percentageCorrect(answers, scorrectAnswers);
            //corrAnswers = Float.toString(answer);
            PercentageCorrect.percentageCorrect(arrayLength, PROBLEMS);
            values.clear();
        }

    }//end function

    public static void doubleDigitSubtraction(){

        final int PROBLEMS = 10;
        Random rand  = new Random();
        Scanner saAnswer = new Scanner(System.in);
        int sDChoice = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        float scorrectAnswers = 0.0F;
        String corrAnswers;

        for (int i = 0; i < 10; i++) {
            int ddsa = rand.nextInt(10, 100);
            int ddsb = rand.nextInt(10, 100);
            int ddsc;
            if (ddsa > ddsb) {
                ddsc = ddsa - ddsb;
                //System.out.println("Answer is" + ddsc);
                System.out.println("Number " + (i + 1));
                System.out.println(" " + ddsa);
                System.out.println("-" + ddsb);
                System.out.println(" __");
            } else {
                ddsc = ddsb - ddsa;
                //System.out.println("Answer is" + ddsc);
                System.out.println("Number " + (i + 1));
                System.out.println(" " + ddsb);
                System.out.println("-" + ddsa);
                System.out.println(" __");
            }
            while(saAnswer.hasNext()){
                sDChoice = saAnswer.nextInt();
                break;
            }
            if (sDChoice == ddsc){//check if user answer equals system answer
                System.out.println("You got it right, good job!");
                values.add(sDChoice);
            }
        }//end for loop
        if (values.size() == 0){
            System.out.println("Sorry, no answers were correct.  Please try again.");
        }
        else{
            int arrayLength = values.size();
            //scorrectAnswers = (arrayLength /3) * 100;
            //float answers = Math.round(scorrectAnswers);
            //PercentageCorrect.percentageCorrect(answers, scorrectAnswers);
            //corrAnswers = Float.toString(answer);
            PercentageCorrect.percentageCorrect(arrayLength, PROBLEMS);
            values.clear();
        }
    }//end function

    public static void tripleDigitSubtraction(){

        final int PROBLEMS = 10;
        Random rand  = new Random();
        Scanner saAnswer = new Scanner(System.in);
        int sDChoice = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        float scorrectAnswers = 0.0F;
        String corrAnswers;

        for (int i = 0; i < 10; i++) {
            int tdsa = rand.nextInt(100, 1000);
            int tdsb = rand.nextInt(100, 1000);
            int tdsc;
            if (tdsa > tdsb) {
                tdsc = tdsa - tdsb;
                //System.out.println("Answer is" + tdsc);
                System.out.println("Number " + (i + 1));
                System.out.println(" " + tdsa);
                System.out.println("-" + tdsb);
                System.out.println(" ___");
            } else {
                tdsc = tdsb - tdsa;
                //System.out.println("Answer is" + tdsc);
                System.out.println("Number " + (i + 1));
                System.out.println(" " + tdsb);
                System.out.println("-" + tdsa);
                System.out.println(" ___");
            }
            while(saAnswer.hasNext()){
                sDChoice = saAnswer.nextInt();
                break;
            }
            if (sDChoice == tdsc){//check if user answer equals system answer
                System.out.println("You got it right, good job!");
                values.add(sDChoice);
            }
        }//end for loop
        if (values.size() == 0){
            System.out.println("Sorry, no answers were correct.  Please try again.");
        }
        else{
            int arrayLength = values.size();
            //scorrectAnswers = (arrayLength /3) * 100;
            //float answers = Math.round(scorrectAnswers);
            //PercentageCorrect.percentageCorrect(answers, scorrectAnswers);
            //corrAnswers = Float.toString(answer);
            PercentageCorrect.percentageCorrect(arrayLength, PROBLEMS);
            values.clear();
        }
    }//end function

}//end class
