public class Bank {
    public static void main(String[] args) {
        double euroBuy = 4.5940;
        double euroSell = 4.6250;
        double spread = euroSell - euroBuy;
        System.out.printf("Spread = %.4f%n",spread);
    }
}
