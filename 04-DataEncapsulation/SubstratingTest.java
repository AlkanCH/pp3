public class SubstratingTest {
    public static void main(String[] args) {
        Substring S1 = new Substring("Have a nice day!");
        System.out.println("The number of characters: "+S1.counter());
        System.out.println("The first 9 characters: "+S1.firstCharacters(9));
        System.out.println("Ends with the suffix \"day!\": "+S1.endTest("day!"));
        System.out.println("Text is not empty: "+S1.isEmpty());
        System.out.println("Space replace: "+S1.replace());
        System.out.println("Upper case: "+S1.upper());
    }
}
