public class C2 {
    private int value;

    public C2() {
        this.value = 0;
    }

    public void increase() {
        this.value++;
    }
    public void decrease() {
        this.value--;
    }

    public void increase(int n) {
        this.value+=n;
    }
    
    public void decrease(int n) {
        this.value-=n;
    }

    public int value(){
        return this.value;
    }
}
