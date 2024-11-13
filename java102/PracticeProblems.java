// java 102 center of mass + midpoint calculator

import java.util.Scanner;

public class PracticeProblems{

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("How many points do you have? (up to 3)");
            int points = scanner.nextInt();

            if (points == 1){
                System.out.println("What's the point of using this calculator then");
                System.exit(0);
            }

            System.out.print("Enter 1st x-coord: ");
            int x1 = scanner.nextInt();

            System.out.print("Enter 1st y-coord: ");
            int y1 = scanner.nextInt();
            
            System.out.print("Enter 2nd x-coord: ");
            int x2 = scanner.nextInt();

            System.out.print("Enter 2nd y-coord: ");
            int y2 = scanner.nextInt();

            if (points == 3){
            System.out.print("Enter 3rd x-coord: ");
            int x3 = scanner.nextInt();

            System.out.print("Enter 3rd y-coord: ");
            int y3 = scanner.nextInt();

                System.out.println("first point: " + "(" + x1 + ", " + y1 + ")");
                System.out.println("second point: " + "(" + x2 + ", " + y2 + ")");    
                System.out.println("Third point: " + "(" + x3 + ", " +  y3 + ")");
                System.out.println("center of mass: " + "(" + ((x1 + x2 + x3) / 3) + ", " + ((y1 + y2 + y3) / 3) + ")");
            }
            else if (points == 2){
                System.out.println("first point: " + "(" + x1 + ", " + y1 + ")");
                System.out.println("second point: " + "(" + x2 + ", " + y2 + ")");    
                System.out.println("midpoint: " + "(" + ((x1 + x2) / 2) + ", " + ((y1 + y2) / 2) + ")"); 
            }
        }
    }
}
        

    



