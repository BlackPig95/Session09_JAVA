package baitap.shape;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
////Kiểm thử Class Shape
//        System.out.println("-------- - SHAPE----------");
//
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//
////kiểm thử Class Circle
//        System.out.println("-------- - CIRCLE----------");
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
////Kiểm thử RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
////Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);

        //Resizable Interface
        //Colorable Interface
        //=====================================================
        Shape[] shapeList = new Shape[10];
        Random random = new Random();
        for (int i = 0; i < shapeList.length; i++)
        {
            int result = random.nextInt(1, 4);
            if (result == 1)
            {
                shapeList[i] = new Circle(random.nextDouble() * (10 - 5) + 5);
                System.out.println("Area: " + String.format("%.2f", shapeList[i].getArea()));
                ResizeShape(shapeList, i, random);
            } else if (result == 2)
            {
                shapeList[i] = new Rectangle(random.nextDouble() * 4 + 4, random.nextDouble() * 5 + 5);
                System.out.println("Area: " + String.format("%.2f", shapeList[i].getArea()));
                ResizeShape(shapeList, i, random);
            } else
            {
                shapeList[i] = new Square(random.nextDouble() * 3 + 3);
                ResizeShape(shapeList, i, random);
                System.out.println("Area: " + String.format("%.2f", shapeList[i].getArea()));
                if (shapeList[i] instanceof Square)
                {
                    System.out.println("True+++++++++++++++++++++++++++++++++++++++++++++");
                    Square tempSquare = (Square) shapeList[i];
                    tempSquare.howToColor();
                    System.out.println("End square++++++++++++++++++++++++++++++++++++++");
                }
            }
        }
        //=====================================================

    }

    public static void ResizeShape(Shape[] shapes, int index, Random random)
    {
        System.out.println("Resize shape called____________________________________________________");
        System.out.println(shapes[index].toString());
        double randomNum = random.nextDouble();
        shapes[index].resize(randomNum > 0.999999999999999 ? 1 : randomNum);
        System.out.println("After resize");
        System.out.println(shapes[index].toString());
        System.out.println("Resize shape ended_____________________________________________________");
    }
}