package oop1;

public class handphone {
    // state atau atribut
    String camera;
    String merek;
    String seri;
    int batray;
    String screen;

    // constructor
    public handphone(String camera, String merek, String seri, int batray, String screen) {
        this.camera = camera;
        this.merek = merek;
        this.seri = seri;
        this.batray = batray;
        this.screen = screen;
    }

    public handphone(String merek, String seri) {
        this.merek = merek;
        this.seri = seri;
    }

    // behavior atau method
    public void info() {
        System.out.println("Mereknya Adalah : " + merek);
        System.out.println("Serinya Adalah : " + seri);
    }

    public void memfoto() {

    }

    public void telephone() {

    }

}
