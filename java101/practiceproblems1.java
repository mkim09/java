public class practiceproblems1 {
 
        public static double sumGrid(double[][] grid) {
            double sum = 0.0;
            
            // Nested for loops to iterate through the 2D array
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    sum += grid[i][j];
                }
            }
            
            return sum;
        }
    
        public static void main(String[] args) {
            
            double[][] grid = {
                {1.2, 3.4, 5.6},
                {7.8, 9.0, 1.1},
                {2.3, 4.5, 6.7}
            };
            
            System.out.println("Sum of grid elements: " + sumGrid(grid));
        }
    }
    

