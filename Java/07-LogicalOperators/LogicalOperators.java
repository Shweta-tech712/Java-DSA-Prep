
public class LogicalOperators {
    public static void main( String [] args ) {

        int age = 21;
        boolean hasLicense = true;
        boolean isIndianCitizen = true;

        System.out.println("Can drive : " + (age >= 18 && hasLicense));
        System.out.println("Eligible for citizenship : " + (age >= 18 && isIndianCitizen));
        System.out.println("hasLicense or isIndianCitizen : " + (hasLicense || isIndianCitizen));
        System.out.println("hasLicense : " + (!hasLicense));
        System.out.println("Is the candidate NOT 18 or older? : " + !(age >= 18));


    }
    
}
