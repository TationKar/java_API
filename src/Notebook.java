public class Notebook {
    String model;
    int ram_gb;
    int hdd_cap_gb;
    String os;
    String color;

    @Override
    public String toString() {
        return "model: " + model + ", ram_gb: " + ram_gb + ", hdd_cap_gb: " + hdd_cap_gb + ", os: " + os + ", color: " + color;
    }

}
