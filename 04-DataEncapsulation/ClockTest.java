public class ClockTest {
    public static void main(String[] args) {
        Clock c1 = new Clock(23, 58);
        for(int i=0;i<6;i++){
            System.out.println("Hour: "+c1.getHour());
            System.out.println("Minute: "+c1.getMinute());
            c1.addMinute();
        }
        
    }
}
