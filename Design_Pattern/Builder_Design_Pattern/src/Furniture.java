import java.util.ArrayList;
import java.util.List;

public class Furniture {
    private List<Item> items = new ArrayList<Item>();

    public void tambahbarang(Item item) {
        items.add(item);
    }

    public int getBiaya(){
        int biaya = 0;

        for (Item item : items) {
            biaya += item.harga();
        }
        return biaya;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.nama());
            System.out.print(", Jenis Kayu : " + item.jenisKayu().kayu());
            System.out.println(", Harga : " + item.harga());
        }
    }
}
