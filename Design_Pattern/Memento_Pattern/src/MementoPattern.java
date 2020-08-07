public class MementoPattern {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Sofa");
        originator.setState("Kursi Tamu");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Meja Makan Kecil");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Meja Makan Besar");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}