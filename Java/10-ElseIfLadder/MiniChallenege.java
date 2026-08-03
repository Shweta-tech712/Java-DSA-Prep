public class MiniChallenege {
    public static void main( String[] args ) {

        int age = 65;

        if ( age >= 60 ) {
            System.out.println("Seniour Citizen");
        }
        else if ( age >= 18 ) {
            System.out.println("Adult");
        }
        else if ( age >= 13 ) {
            System.out.println("Teen");
        }
        else {
            System.out.println("Child");
        }
    }
}
