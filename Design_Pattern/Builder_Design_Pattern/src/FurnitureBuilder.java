public class FurnitureBuilder {

        public Furniture preparekursitamu (){
            Furniture furniture = new Furniture();
            furniture.tambahbarang(new KursiTamu());
            return furniture;
        }

        public Furniture preparemejamakan (){
            Furniture furniture = new Furniture();
            furniture.tambahbarang(new MejaMakan());
            return furniture;
        }
    }
