public class Importer {
    public String name;
    public double price;
    public String dateOfExpiration;

    public Importer(){
        this.name="Grigorsko hapche";
        this.price=5.50;
        this.dateOfExpiration="03.02.2023";
    }

    public Importer(String name, double price, String dateOfExpiration) {
        this.name = name;
        this.price = price;
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String toString() {
        return "Importer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateOfExpiration='" + dateOfExpiration + '\'' +
                '}';
    }
}
