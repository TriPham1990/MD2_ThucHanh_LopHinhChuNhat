import java.awt.*;
import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();

        ClassRectangle rectangle = new ClassRectangle(width,height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
