public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);

        Point p2 = point.translateX(3);
        System.out.println("Translated point: (" + p2.x + ", " + p2.y + ")");

        Point xTranslation = point.translateX(6);
        Point yTranslation = point.translateY(-7);
        Point xyTranslation = point.translateX(-4).translateY(-3);
                System.out.println(" ");


        System.out.println("x transl: (" + xTranslation.x + ", " + xTranslation.y + ")");
                System.out.println(" ");

        
        System.out.println("y transl: (" + yTranslation.x + ", " + yTranslation.y + ")");
                System.out.println(" ");

        System.out.println("xy transl: (" + xyTranslation.x + ", " + xyTranslation.y + ")");
                System.out.println(" ");

     
    }
}