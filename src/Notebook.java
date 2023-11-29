public class Notebook {
    String model;
    int ram_gb;
    int hdd_cap_gb;
    String os;
    String color;

    @Override
    public String toString() {
        return model + ", RAM: " + ram_gb + ", HDD: " + hdd_cap_gb + ", " + os + ", " + color;
    }

}
