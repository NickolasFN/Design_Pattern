public abstract class Kursi implements Item {

    @Override
    public JenisKayu jenisKayu(){
        return new Jati();
    }

    @Override
    public abstract int harga();
}
