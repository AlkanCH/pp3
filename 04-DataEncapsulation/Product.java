public class Product {
    private String name;
    private boolean isVege;
    
    public String getName() {
        return name;
    }
    public boolean isVege() {
        return isVege;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVege(boolean isVege) {
        this.isVege = isVege;
    }
    @Override
    public String toString() {
        return "Product name = " + name + ", isVege = " + isVege;
    }

    public static void main(String[] args) {
        Product sznycel = new Product();
        sznycel.setName("Sznycel");
        sznycel.setVege(false);
        System.out.println(sznycel.toString());


        Product banan = new Product();
        banan.setName("Banan");
        banan.setVege(true);
        System.out.println(banan.toString());

    }
}
