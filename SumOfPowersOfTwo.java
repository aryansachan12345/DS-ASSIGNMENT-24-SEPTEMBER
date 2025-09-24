public class SumOfPowersOfTwo {

    
    public static int sumOfPowers(int n) {
        
        if (n == 0) {
            return 1;  
        }
        
        return (int)Math.pow(2, n) + sumOfPowers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of powers of 2 up to " + n + " = " + sumOfPowers(n));
    }
}
