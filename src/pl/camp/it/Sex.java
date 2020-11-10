package pl.camp.it;

public enum Sex {
    MAN(10, "Men"),
    WOMAN(15, "Woman"),
    OTHER(20, "Other"),
    OTHER2(25, "Other2");

    int value;
    String stringValue;

    Sex(int value, String stringValue) {
        this.value = value;
        this.stringValue = stringValue;
    }

    public void abc() {
        System.out.println("Sex !!");
    }
}
