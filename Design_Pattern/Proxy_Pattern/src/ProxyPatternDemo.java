public class ProxyPatternDemo {

    public static void main(String[] args) {
        Item item = new ProxyItem("Kursi Tamu");
        Item item1 = new ProxyItem("Meja Makan");
        Item item2 = new ProxyItem("Sofa");

        //item will be loaded from disk
        item.display();
        System.out.println("");

        item1.display();
        System.out.println("");

        item2.display();
        System.out.println("");

        //item will not be loaded from disk
        item.display();
        item1.display();
        item2.display();
    }
}