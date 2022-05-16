public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //get an object of Rectangle and call its draw method.
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Rectangle
        shape1.draw();
        //get an object of Circle and call its draw method.
        Shape shape2 = shapeFactory.getShape("CIRCLE");
        //call draw method of Circle
        shape2.draw();
        //get an object of Triangle and call its draw method.
        Shape shape3 = shapeFactory.getShape("TRIANGLE");
        //call draw method of Triangle
        shape3.draw();
    }
}

