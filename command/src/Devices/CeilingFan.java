package Devices;

public class CeilingFan {

    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Ceiling Fan: On");
    }

    public void off() {
        System.out.println(name + " Ceiling Fan: Off");
    }
}