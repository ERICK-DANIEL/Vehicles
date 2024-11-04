public class WaterVehicle extends Vehicle implements IJetPropulsion{
    private String type;
    private String path;

    WaterVehicle(int power, int year, String brand, String type, String path) {
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
    public String moveJetPropulsion() {
        return "Moviendo con propulsion de chorro";
    }
}