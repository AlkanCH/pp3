public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        return (this.x==0)? true:false;
    }

    public boolean isY() {
        return (this.y==0)? true:false;
    }

    public String toString() {
        return "P("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point p1 = new Point(3,0);
        System.out.println(p1.isX());
        System.out.println(p1.isY());
        System.out.println(p1.toString());
    }
}
