public class IfElseStatement {
    public static void main( String[] args ) {

        int age = 17;
        if ( age >= 18 ) {
            System.out.println("You are Eligible to Vote ");
        } else {
            System.out.println( "You are not Eligible to Vote" );
        }

        int marks = 35;
        if ( marks >= 40 ) {
            System.out.println( "Congratulations you are passed" );
        } else {
            System.out.println( "Sorry! you are failed" );
        }

        double balance = 800;

        if ( balance > 1000 ) {
            System.out.println( "Transaction Allowed" );
        } else {
            System.out.println( "Insufficient Balance" );
        }
          


    }
    
}
