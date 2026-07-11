public class DeliveryAddress {

    private int id;
    private String brgy;
    private String cityName;
    private String provinceName;
    private String countryName;
    private String zipCode;

    public DeliveryAddress(int id, String brgy, String cityName,
                           String provinceName, String countryName, String zipCode) {

        this.id = id;
        this.brgy = brgy;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.countryName = countryName;
        this.zipCode = zipCode;
    }

    public void addNewAddress() {
        System.out.println("Address has been added.");
    }

    public void removeAddress() {
        System.out.println("Address has been removed.");
    }
}