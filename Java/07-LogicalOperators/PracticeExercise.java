public class PracticeExercise {
    public static void main( String [] args ) {

        int marks = 85;
        boolean feesPaid = true;


        System.out.println("Eligible for Exam : " + (marks >= 40 && feesPaid));
        System.out.println("Eligible for Scholarship : " + (marks >= 90 || feesPaid));
        System.out.println("Fees Not Paid : " + !(feesPaid));
    }
}
