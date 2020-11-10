package pl.camp.it;

public enum Konsola {
    PS5("PlayStation", "5", "AMD", "500", "Radeon", 500),
    PS4("PlayStation", "4", "Intel", "500", "NVidia", 300),
    XBOXONE("Microsoft Xbox", "One", "Intel", "500", "NVidia", 200),
    NINTENDO("Nintendo", "DS", "AMD", "500", "Radeon", 500);

    String brand;
    String model;
    String processor;
    String hardDrive;
    String graphic;
    int price;

    Konsola(String brand, String model, String processor, String hardDrive, String graphic, int price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.graphic = graphic;
        this.price = price;
    }
}
