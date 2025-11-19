package Task02;


public class ShapeArray {
    private Shape[] shapeList;
    private int noOfShapes;

    // constructor
    public ShapeArray(int size){
        shapeList = new Shape[size];
        noOfShapes = 0;
    }

    @Override
    public String toString() {
        return "ShapeList [ " + shapeList.toString() + ", " + noOfShapes + "]"; 
    }

    // 1. method to add shape
    public boolean addShape(Shape s){
        if(noOfShapes >= shapeList.length) return false;
        
        shapeList[noOfShapes] = s;
        noOfShapes++;

        return true;
    }

    // 2.  this method will return number of circles
    public int getCircleCounter(){
        int count = 0; // mandatory to intialize

        for(int i = 0; i < noOfShapes; i++){
            if(shapeList[i] instanceof Circle){
                count++;
            }
        }
        return count;
    }

    // 3. get average of all rectangle's area
    public double getAvgRectArea(){
        int rectangleCount = 0;
        double totalArea = 0.00;

        for(int i = 0; i < noOfShapes; i++){
            if(shapeList[i] instanceof Rectangle){
                Rectangle rect = (Rectangle)shapeList[i];
                
                totalArea += rect.getLength()*rect.getWidth();
                rectangleCount++;
            }
        }

        if(rectangleCount == 0) return 0.00; // what if we don't have any rectangle in our shapeList

        return totalArea/rectangleCount;
    }

    // 4. method to remove all rectangles
    public void removeAllRect(){
        for(int i = 0; i < noOfShapes; i++){

            if(shapeList[i] instanceof Rectangle){
                for(int j = i; j < noOfShapes - 1; j++){
                    shapeList[j] = shapeList[j+1];
                }
            }
            noOfShapes--;
        }
    }





    


}
