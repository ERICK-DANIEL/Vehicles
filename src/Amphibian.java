public class Amphibian extends Vehicle implements IJetPropulsion, IWheels{
    private String type;
    private String path;

    Amphibian(int power, int year, String brand, String type, String path) {
        super(power, year, brand);
        this.type = type;
        this.path = path;
    }

    public String pathPrograming() {
        return "El camino programado es: " + path;
    }

    @Override
    public String description() {
        return getDescription() + ", Tipo: " + type;
    }

    @Override
    public String moveWheels() {
        return "Moviendo con ruedas";
    }

    @Override
    public String moveJetPropulsion() {
        return "Moviendo con propulsion de chorro";
    }
}
