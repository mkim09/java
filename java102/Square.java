public class Square {
    public final Point corner;
    public final double sideLength;

    /**
    * @param corner The bottom left corner of the square
    * @param sideLength The length of the side of the square
    */
    public Square(Point corner, double sideLength) {
        this.corner = corner;
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;  
    }
    
    public double perimeter() {
        return 4 * sideLength;  
    }
    
    /** 
    * @return Whether point p is inside of the square.
    */
    public boolean isInside(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;
        return 0 < xDist && xDist < sideLength &&
               0 < yDist && yDist < sideLength;
    }

    /** 
    * @return Whether point p is part of/on the border of the square.
    */
    public boolean isOn(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;
        
        // Check if the point is on the left or right edges or top or bottom edges
        boolean onLeftOrRightEdge = (xDist == 0 || xDist == sideLength) && (0 <= yDist && yDist <= sideLength);
        boolean onTopOrBottomEdge = (yDist == 0 || yDist == sideLength) && (0 <= xDist && xDist <= sideLength);
        
        return onLeftOrRightEdge || onTopOrBottomEdge;
    }
    
    /** 
    * @param x How much to translate the square by in the + x direction.
    * @param y How much to translate the square by in the + y direction.
    * @return The square that results from the translation.
    */
    public Square translate(double x, double y) {
        // Translate the corner point by x and y
        Point newCorner = new Point(corner.x + x, corner.y + y);
        return new Square(newCorner, sideLength);
    }

    /** 
    * @return The square that results from scaling the side length and maintaining the bottom left corner.
    */
    public Square scale(double k) {
        return new Square(corner, sideLength * k);
    }

    public Point[] corners() {
        // Calculate the four corners of the square using the bottom left corner
        Point topRight = new Point(corner.x + sideLength, corner.y + sideLength);
        Point topLeft = new Point(corner.x, corner.y + sideLength);
        Point bottomRight = new Point(corner.x + sideLength, corner.y);
        Point bottomLeft = corner;  // Same as this.corner

        return new Point[] {bottomLeft, bottomRight, topRight, topLeft};
    }

    @Override
    public String toString() {
        return "(corner: " + corner + "; side length: " + sideLength + ")";
    }
}
