public class BuilderPattern {
        public static void main(String[] args) {

            FurnitureBuilder mealBuilder = new FurnitureBuilder();

            Furniture kursitamu = mealBuilder.preparekursitamu();
            System.out.println("Kursi Tamu");
            kursitamu.showItems();
            System.out.println("Total Harga: " + kursitamu.getBiaya());

            Furniture mejamakan = mealBuilder.preparemejamakan();
            System.out.println("\n\nMeja Makan");
            mejamakan.showItems();
            System.out.println("Total Harga: " + mejamakan.getBiaya());
        }
    }
