public class BridgePatternExample {
    public static void main(String[] args) {
        Shape circle = new Circle(new OpenGLDrawingAPI());
        circle.draw();

        Shape square = new Square(new DirectXDrawingAPI());
        square.draw();
    }
}