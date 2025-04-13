public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        
        System.out.println("Age: ");
        
        if(age >= 18) {
            System.out.println("This person is eligible to vote.");
        } else {
            System.out.println("This person is NOT eligible to vote.");
        }
    }
}