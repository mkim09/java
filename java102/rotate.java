import java.awt.Point;
import java.util.Scanner;

public class rotate {
    public Point rotate90() {
        return new Point(2, 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to rotate counterclockwise or clockwise? \nType 'ccw' for counterclockwise and 'cw' for clockwise");
        String response = scanner.nextLine();


        if (response.equals("cw")){ 
        rotate obj = new rotate();
        Point rotatedPoint = obj.rotate90();
        System.out.println("Rotated Point: (" + rotatedPoint.y + ", " + "-" + rotatedPoint.x + ")");
        }

        else if (response.equals("ccw")){
        rotate obj = new rotate();
        Point rotatedPoint = obj.rotate90();
        System.out.println("Rotated Point: (-" + rotatedPoint.y + ", " + rotatedPoint.x + ")");
        }
    }
}
