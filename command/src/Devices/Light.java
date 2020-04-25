package Devices;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Light: On");
    }

    public void off() {
        System.out.println(name + " Light: off");
    }
}