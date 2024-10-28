class Square extends Shape {
    public Square(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawShape("Square");
    }
}
