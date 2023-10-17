package intro;

public class RectanglePerimeterArea {

    public double calculateArea(int width, int length) {
        return width * length;
    }

    public void areaOfRectangle() {
        double length = 35;
        double width = 20;
        double area = length * width;
        System.out.printf("Area of rectangle is: %.2f", area);
    }
    public void perimeterOfRectangle() {
        double length = 35;
        double width = 20;
        double perimeter =  2 * (length * width);
        System.out.printf("Perimeter of rectangle is: %.2f", perimeter);
    }

    public static void main(String[] args) {

    }
}
