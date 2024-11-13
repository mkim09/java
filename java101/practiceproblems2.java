public class practiceproblems2 {
        public static int countOccurrences(int[] arr, int n) {
            int count = 0;
            
           
            for (int num : arr) {
                if (num == n) {
                    count++;
                }
            }
            
            return count;
        }
    
        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 2, 5, 2, 6};
            int n = 2;
            
            System.out.println("Number of occurrences of " + n + ": " + countOccurrences(arr, n));
        }
    }
    

