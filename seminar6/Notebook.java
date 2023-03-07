package seminar6;

public class Notebook {
    private String model;
    private String ssd; 
    private String ram; 
    private String color;
    private String os;


    public Notebook(String model, String ssd, String ram, String color, 
            String os) {
        this.model = model;
        this.ssd = ssd;
        this.ram = ram;
        this.color = color;
        this.os = os;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    

    @Override
    public String toString() {
        return "Notebook [model=" + model + ", ssd=" + ssd + ", ram=" + ram
                + ", color=" + color + ", os=" + os + "]";
    }



}
