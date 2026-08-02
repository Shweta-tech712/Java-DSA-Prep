public class MiniChallenge {
    public static void main( String[] args ) {

        double cartAmount = 2500;
        boolean isPremiumMember = true;


        System.out.println("Free Delivery : " + (cartAmount >= 2000 || isPremiumMember));
    }
}
