public class TVtest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.On();
        tv.displayStatus();
        tv.Off();
        tv.displayStatus();

        tv.On();
        tv.displayStatus();
        tv.channelUp();
        tv.setChannel(7);
        tv.setChannel(142);
        tv.displayStatus();
        tv.channelDown();
        tv.displayStatus();
        tv.Off();
        tv.displayStatus();

        tv.On();
        tv.displayStatus();
        tv.setChannel(15);
    }
}
