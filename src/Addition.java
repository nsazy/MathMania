import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Addition {

    public static void singleDigitAddition(){

        int sDigitAnswers []  = new int[4];
        int sDigitValues [];
        final int PROBLEMS = 10;
        Random rand  = new Random();
        Scanner saAnswer = new Scanner(System.in);
        int sDChoice = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        float scorrectAnswers = 0.0F;
        String corrAnswers;
        for (int i = 0; i < 10; i++){

            int sa = rand.nextInt(1, 10);
            int sb = rand.nextInt(1, 10);
            int sc = sa + sb;
            //System.out.println("C is" +  sc);
            System.out.println("Number " + (i + 1));
            System.out.println(" " + sa);
            System.out.println("+"+ sb);
            System.out.println(" _");
            while(saAnswer.hasNext()){
                sDChoice = saAnswer.nextInt();
                break;
            }
            if (sDChoice == sc){//check if user answer equals system answer
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

    }//end of function

    public static void doubleDigitAddition(){

        int dDigitAnswers []  = new int[4];
        int dDigitValues [];
        final int PROBLEMS = 10;
        Random rand  = new Random();
        Scanner saAnswer = new Scanner(System.in);
        int sDChoice = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        float scorrectAnswers = 0.0F;
        String corrAnswers;
        for (int i = 0; i < 10; i++){

            int da = rand.nextInt(10, 100);
            int db = rand.nextInt(10, 100);
            int dc = da + db;
            //System.out.println("C is" +  dc);
            System.out.println("Number " + (i + 1));
            System.out.println(" " + da);
            System.out.println("+"+ db);
            System.out.println(" __");
            while(saAnswer.hasNext()){
                sDChoice = saAnswer.nextInt();
                break;
            }
            if (sDChoice == dc){//check if user answer equals system answer
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

    }//end of function

    public static void tripleDigitAddition(){

        int dDigitAnswers []  = new int[4];
        int dDigitValues [];
        final int PROBLEMS = 10;
        Random rand  = new Random();
        Scanner saAnswer = new Scanner(System.in);
        int sDChoice = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        float scorrectAnswers = 0.0F;
        String corrAnswers;
        for (int i = 0; i < 10; i++){

            int ta = rand.nextInt(100, 1000);
            int tb = rand.nextInt(100, 1000);
            int tc = ta + tb;
            //System.out.println("C is" +  tc);
            System.out.println("Number " + (i + 1));
            System.out.println(" " + ta);
            System.out.println("+"+ tb);
            System.out.println(" ___");
            while(saAnswer.hasNext()){
                sDChoice = saAnswer.nextInt();
                break;
            }
            if (sDChoice == tc){//check if user answer equals system answer
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

    }//end of function


}
