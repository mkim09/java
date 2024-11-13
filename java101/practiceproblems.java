// java 101 practice problem answer
// sum of numbers in fib sequence

public class practiceproblems {
    public static void main(String[] args) {
        int[] fibonnachi = {0, 1, 1, 2, 3, 5, 8, 13};
        int sum = 0;
        for (int i : fibonnachi) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
