public abstract class Meja implements Item {

    @Override
    public JenisKayu jenisKayu(){
        return new Mahoni();
    }

    @Override
    public abstract int harga();
}
