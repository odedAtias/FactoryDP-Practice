public class ShapeFactory {
    public Shape getShape(String str) {
        if (str.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (str.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (str.equalsIgnoreCase("TRIANGLE"))
            return new Triangle();
        else return null;
    }
}
