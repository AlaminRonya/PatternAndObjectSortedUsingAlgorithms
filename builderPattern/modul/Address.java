package builderPattern.modul;

public class Address {
    private String villageName;
    private String district;

    public Address() {
    }

    public Address(String villageName, String district) {
        this.villageName = villageName;
        this.district = district;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "villageName='" + villageName + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
