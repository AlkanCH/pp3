public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.area());

        Triangle triangle = new Triangle(2, 3);
        System.out.println(triangle.area());

        Circle circle = new Circle(2);
        System.out.println(circle.area());
    }
}
