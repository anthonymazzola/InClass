public class sum_even_fibonacci {
    public static void main(String[] args) {
        // Initializing variables
        int a = 0, b = 1;
        int sumEven = 0;
        
        // While loop to sum even fibonacci
        while (b < 4000000) {
            if (b % 2 == 0) {
                sumEven += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
