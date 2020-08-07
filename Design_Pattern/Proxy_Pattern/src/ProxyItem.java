public class ProxyItem implements Item {

    private RealItem realItem;
    private String fileName;

    public ProxyItem(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realItem == null){
            realItem = new RealItem(fileName);
        }
        realItem.display();
    }
}