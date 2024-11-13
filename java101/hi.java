public class hi {
    public static void main(String[] args) {
     
            int[][] arr = new int[3][3];
            int value = 1;
           

            for (int e = 0; e < arr.length; e++) {
                for (int i = 0; i < arr[e].length; i++) {
                arr[e][i] = value;
                value++;
                System.out.println(arr[e][i]);
                }
            } 

    }
}

