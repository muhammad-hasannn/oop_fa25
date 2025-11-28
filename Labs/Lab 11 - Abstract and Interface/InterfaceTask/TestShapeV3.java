/*
Version 3: (Square, Cirlce)
this time i have taken CircleV2.
CircleV2 extends Ellipse
 */


package InterfaceTask;

import java.util.Random;

import Provided.Interface.CircleV2;
import Provided.Interface.Ellipse;
import Provided.Abstraction.Shape;
import Provided.Abstraction.Square;


public class TestShapeV3 {
    public static Shape[] createShape() {

        final int SIZE = 5;
        final double DIMENSION = 100;
        final int NUMBER_OF_SHAPES = 2;   // now we have only 2 shapes

        Random generator = new Random();

        Shape[] randomShapes = new Shape[generator.nextInt(SIZE) + 1];

        for (int i = 0; i < randomShapes.length; i++) {

            int assigner = generator.nextInt(NUMBER_OF_SHAPES); // gives 0 or 1

            switch (assigner) {
                case 0:
                    randomShapes[i] = new Square(generator.nextDouble()*DIMENSION);
                    break;
                case 1:
                    randomShapes[i] = new Ellipse(generator.nextDouble()*DIMENSION, generator.nextDouble()*DIMENSION);
                    break;
            }
        }

        return randomShapes;
    }

    public static void main(String[] args) {

        // correct way to call a static method
        Shape[] randomShapes = TestShapeV3.createShape();

        for (Shape s : randomShapes) {
            System.out.println(s);
        }



        // Task 2: Testing circle here
        Ellipse circle = new CircleV2(50.0);

        System.out.println(circle);
    }
}
