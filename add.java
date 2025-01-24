public class add {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10; // First 10 natural numbers

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
