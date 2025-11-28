/*
Version 1 of TestShape. (Circle, Rectangle, Square)
 */

package Provided.Abstraction;

import java.util.Random;

public class TestShapeV1 {
    public static Shape[] createShape(){
        final int SIZE = 5;
        final double DIMENSION = 100;
        final int NUMBER_OF_SHAPES = 3;

        Random generator = new Random();

        // declaring array
        Shape[] randomShapes = new Shape[generator.nextInt(SIZE) + 1]; // generator.nextInt(SIZE) = (0-4), so +1 to make it (1-5)

        // now filling each index with a random shape
        for(int i = 0; i < randomShapes.length; i++){

            int assigner = generator.nextInt(NUMBER_OF_SHAPES); // 0 - 2
            // as we have total 3 shapes,
            // it will give us a number, and we will assign a specific shape based on that number

            switch (assigner) {
                case 0:
                    randomShapes[i] = new CircleV1(generator.nextDouble()*DIMENSION);
                    // multiplying with DIMENSION because generator.nextDouble() = (0.0 - 1.0)
                    break;
                case 1:
                    randomShapes[i] = new Rectangle(generator.nextDouble()*DIMENSION, generator.nextDouble()*DIMENSION);
                    break;
                case 2:
                    randomShapes[i] = new Square(generator.nextDouble()*DIMENSION);
				break;
            }
        }
        return randomShapes;
    }

    public static void main(String[] args) {

        // Shape[] randomShapes = new TestShapeV1().createShape();
        /*
        the new kw is creating obj for TestShapeV1() and then calling createShape().
        there is no need of creating obj because createShapes() is static
        
        createShape() will itself return you an address of already created obj in heap memory.
        */

        // so correct way!
        Shape[] randomShapes = TestShapeV1.createShape();

        for(Shape s : randomShapes){
            System.out.println(s);
        }
    }
}
