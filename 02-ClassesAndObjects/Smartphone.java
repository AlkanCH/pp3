public class Smartphone {
    String brand="Samsung";
    String model="Galaxy A54";
    String number="725111150";
    boolean isOn=true;
    int volume=2;

    void powerButton(){
        isOn = !isOn;
        System.out.println((isOn)?"Włączanie...":"Wyłączanie...");
    }

    void getPhoneInfo() {
        System.out.println("Model: "+brand+" "+"model");
    }
    void getPhoneNumber() {
        System.out.println("Phone number: "+number);
    }
}
