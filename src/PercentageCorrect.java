public class PercentageCorrect {
    public static void percentageCorrect(int arrayLength, final int PROBLEMS) {
        String corrAnswers;
       if (arrayLength >= 1 && arrayLength < 4){
           System.out.println("You answered " + arrayLength + " out of " + PROBLEMS + " correctly.  Keep up the great effort!!");
       }
       else if(arrayLength >=4 && arrayLength <= 8){
           System.out.println("You answered " + arrayLength + " out of " + PROBLEMS + " correctly.  You are doing great!!");
       }
       else {
           System.out.println("You answered " + arrayLength + " out of " + PROBLEMS + " correctly.  Excellent work!!");
       }
    }
}
