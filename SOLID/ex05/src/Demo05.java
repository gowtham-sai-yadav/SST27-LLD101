
public class Demo05 {
    static int areaAfterResize(Shape shape) {
        shape.setWidth(5);
        shape.setHeight(4);
        return shape.getArea();
    }
    
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); // 20
        System.out.println(areaAfterResize(new Square()));    // 16 (!) violates expectation
    }
}
