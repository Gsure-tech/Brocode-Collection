package intro;

public class RectanglePerimeterArea {

    public double calculateArea(int width, int length) {
        return width * length;
    }

    public void areaOfRectangle() {
        double length = 25;
        double width = 30;
        double area = length * width;
        System.out.printf("Area of rectangle is: %.2f", area);
    }
}
