package Genral;

public class GetSet {


    private String name;
    private String address;

    public GetSet(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }
}
