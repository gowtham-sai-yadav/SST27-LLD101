
public class Square implements Shape {
    private int side;
    
    public Square() {
        this.side = 0;
    }
    
    public Square(int side) {
        this.side = side;
    }
    
    @Override
    public void setWidth(int width) {
        this.side = width;
    }
    
    @Override
    public void setHeight(int height) {
        this.side = height;
    }
    
    @Override
    public int getArea() {
        return side * side;
    }
}