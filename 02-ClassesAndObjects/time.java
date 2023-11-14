public class time {
    public static void main(String[] args) {
        int hours=14,minutes=27;
        System.out.printf("time: %d:%d%n",hours,minutes);
        System.out.printf("minutes from midnight: %d%n",hours*60+minutes);
        System.out.printf("seconds from midnight: %d%n",(hours*60+minutes)*60);
    }
}
