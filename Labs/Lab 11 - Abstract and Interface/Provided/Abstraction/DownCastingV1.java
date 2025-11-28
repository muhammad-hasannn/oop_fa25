/*
Version 1 of DownCasting, when equilateral triangle doesn't exists
 */


package Provided.Abstraction;

public class DownCastingV1 {
    public static void main(String[] args) {
        Shape[] randomShapes = TestShapeV1.createShape();

        for (int i = 0; i < randomShapes.length; i++) {
            System.out.println(randomShapes[i]);

            if (randomShapes[i] instanceof CircleV1)
                System.out.println("Radius= " + ((CircleV1)randomShapes[i]).getRadius());

            else if (randomShapes[i] instanceof Square)
                System.out.println("Length= " + ((Square)randomShapes[i]).getLength());

            else if (randomShapes[i] instanceof Rectangle)
                System.out.println("Length= " + ((Rectangle)randomShapes[i]).getLength() + "\nWidth= " + ((Rectangle)randomShapes[i]).getWidth());
        }
    }
}
