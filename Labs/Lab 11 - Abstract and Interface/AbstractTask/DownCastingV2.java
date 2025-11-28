/*Version 2 */

package AbstractTask;

import Provided.Abstraction.CircleV1;
import Provided.Abstraction.Rectangle;
import Provided.Abstraction.Shape;
import Provided.Abstraction.Square;
import Provided.Abstraction.TestShapeV1;

public class DownCastingV2 {
    public static void main(String[] args) {
        Shape[] randomShapes = TestShapeV1.createShape();

        for (int i = 0; i < randomShapes.length; i++) {
            System.out.println(randomShapes[i]);

            if (randomShapes[i] instanceof CircleV1){
                System.out.println("Radius= " + ((CircleV1)randomShapes[i]).getRadius());
            }
            else if (randomShapes[i] instanceof Square){
                System.out.println("Length= " + ((Square)randomShapes[i]).getLength());
            }
            else if (randomShapes[i] instanceof Rectangle){
                System.out.println("Length= " + ((Rectangle)randomShapes[i]).getLength() + "\nWidth= " + ((Rectangle)randomShapes[i]).getWidth());
            }
            else if (randomShapes[i] instanceof EquilateralTriangle){
                System.out.println("Length of each side = " + ((EquilateralTriangle)randomShapes[i]).getSide());
            }
        }
    }
}
