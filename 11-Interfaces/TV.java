public class TV implements CanOnOff,CanChangeChannel,CanChangeVolume{
    private boolean isOn;
    private int channelNo;
    private int maxChannel;
    private int minChannel;
    private int volume;

    public TV() {
        this.isOn = false;
        this.channelNo = 1;
        this.maxChannel = 99;
        this.minChannel = 1;
        this.volume = 1;
    }

    @Override
    public void Off() {
        isOn=false;
    }

    @Override
    public void On() {
        isOn=true;
        channelNo=1;
        volume=1;
    }

    @Override
    public void channelDown() {
        if(isOn==true){
            channelNo--;
            if(channelNo<minChannel){
                channelNo=maxChannel;
            }
        }
    }

    @Override
    public void channelUp() {
        if(isOn==true){
            channelNo++;
            if(channelNo>maxChannel){
                channelNo=minChannel;
            }
        }
    }

    @Override
    public void setChannel(int n) {
        if(isOn==true && n<=maxChannel && n>=minChannel){
            channelNo=n;
        }
    }

    @Override
    public void volumeDown() {
        if(isOn==true && volume>1){
            volume--;
        }
    }

    @Override
    public void volumeUp() {
        if(isOn == true && volume<10){
            volume++;
        }
    }

    public void displayStatus(){
        if(isOn==false){
            System.out.println("TV is off");
        }
        else{
            System.out.println("TV is on");
            System.out.println("Channel: "+channelNo);
            System.out.println("Volume: "+volume);
        }
    }
}
