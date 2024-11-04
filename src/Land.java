public class Land extends Vehicle implements IWheels {
    private String type;
    private Location location;

    Land(int power, int year, String brand, String type, Location location) {
        super(power, year, brand);
        this.type = type;
        this.location = location;
    }

    @Override
    public String description() {
        return getDescription() + ", Tipo: " + type + ", Locacion: " + location.getLocation();
    }

    @Override
    public String moveWheels() {
        return "Moviendo con ruedas";
    }
}

