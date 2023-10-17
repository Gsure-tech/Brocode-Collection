package intro;

public class RectanglePerimeterArea {

    public double calculateArea(int width, int length) {
        return width * length;
    }

    public void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.printf("Area of rectangle is: %.2f\n", area);
    }
    public void perimeterOfRectangle(double length, double width) {

        double perimeter =  2 * (length * width);
        System.out.printf("Perimeter of rectangle is: %.2f", perimeter);
    }

    public static void main(String[] args) {
       RectanglePerimeterArea rectanglePerimeterArea = new RectanglePerimeterArea();
       rectanglePerimeterArea.areaOfRectangle(20, 23);
       rectanglePerimeterArea.perimeterOfRectangle(25, 4);
    }
}
