public class PrimeCheck {
    public static void main(String[] args) {
        int num = 7;
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }
}
