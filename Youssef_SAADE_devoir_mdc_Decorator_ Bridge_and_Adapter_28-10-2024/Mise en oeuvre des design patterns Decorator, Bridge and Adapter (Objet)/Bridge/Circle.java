class Circle extends Shape {
    public Circle(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawShape("Circle");
    }
}
