/*
Version 2: (CircleV1, Rectangle, Square, EquilateralTriangle)
*/

package AbstractTask;

import java.util.Random;

import Provided.Abstraction.CircleV1;
import Provided.Abstraction.Rectangle;
import Provided.Abstraction.Shape;
import Provided.Abstraction.Square;
import Provided.Abstraction.TestShapeV1;

public class TestShapeV2 {
    public static Shape[] createShape(){
        final int SIZE = 5;
        final double DIMENSION = 100;
        final int NUMBER_OF_SHAPES = 4; // shapes are now 4

        Random generator = new Random();

        Shape[] randomShapes = new Shape[generator.nextInt(SIZE) + 1]; // generator.nextInt(SIZE) = (0-4), so +1 to make it (1-5)

        // now filling each index with a random shape
        for(int i = 0; i < randomShapes.length; i++){

            int assigner = generator.nextInt(NUMBER_OF_SHAPES); // 0-3
            // as we have total 4 shapes,
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
                case 3:
                    randomShapes[i] = new EquilateralTriangle(generator.nextDouble()*DIMENSION);
				break;

            }
        }
        return randomShapes;
    }

    public static void main(String[] args) {

        Shape[] randomShapes = TestShapeV1.createShape();

        for(Shape s : randomShapes){
            System.out.println(s);
        }
    }

}
