package intro;

import java.util.Scanner;

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
//       rectanglePerimeterArea.areaOfRectangle(20, 23);
//       rectanglePerimeterArea.perimeterOfRectangle(25, 4);

       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the rectangle");
//        double length = sc.nextDouble();
//        System.out.println("Enter the width of the rectangle");
//        double width = sc.nextDouble();
        //2rectanglePerimeterArea.areaOfRectangle(length,width);

        System.out.println("Do you want to calculate the perimeter of the rectangle?  YES/NO");
        String answer = sc.nextLine();
        if(answer.equals("yes")){
            System.out.println("Enter the length");
            double length = sc.nextDouble();
            System.out.println("Enter the width");
            double width = sc.nextDouble();
            rectanglePerimeterArea.perimeterOfRectangle(length,width);
        }
        else System.out.println("program terminated");
    }
}
