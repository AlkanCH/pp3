public class C5 {
    private int x;
    private int y;

    public C5(int x, int y) {
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
}
