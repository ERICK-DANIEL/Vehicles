public class Location {
    private String city;
    private String country;

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getLocation() {
        return "Ciudad: " + city + ", Pais: " + country;
    }
}
