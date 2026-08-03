public class PracticeExercise {
    public static void main( String[] args ) {

        double Salary = 65000;

        if ( Salary >= 100000 ) {
            System.out.println("20% bonus");
        }
        else if( Salary >= 70000 ) {
            System.out.println("15% bonus");
        }
        else if( Salary >= 50000 ) {
            System.out.println("10% bonus");
        }
        else {
            System.out.println("No bonus");
        }

        int temperature = 32;

        if ( temperature >= 40 ) {
            System.out.println("Very hot");
        }
        else if( temperature >= 30 ) {
            System.out.println("Hot");
        }
        else if( temperature>= 20 ) {
            System.out.println("Pleasant");
        }
        else if( temperature >= 10 ) {
            System.out.println("Cold");
        }
        else {
            System.out.println("Very Cold");
        }


    }
}
