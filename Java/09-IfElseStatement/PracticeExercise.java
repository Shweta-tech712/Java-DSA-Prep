public class PracticeExercise {
    public static void main( String[] args ) {

        double temperature = 38.5;
        if ( temperature >= 37.5 ) {
            System.out.println( "High fever" );
        } else {
            System.out.println( "Normal temperature" );
        }

        int battery = 15;
        if ( battery >= 20 ) {
            System.out.println( "Battery is Sufficient " );
        } else {
            System.out.println( "Change your phone battery" );
        }

        boolean internetConnected = true;
        if ( internetConnected ) {
            System.out.println( "Internet is connected" );
        } else {
            System.out.println( "No Internet Connection" );
        }
    }
}
