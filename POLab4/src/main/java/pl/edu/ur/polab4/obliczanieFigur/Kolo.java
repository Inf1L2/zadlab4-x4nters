package pl.edu.ur.polab4.obliczanieFigur;

public class Kolo {
    private String nazwa;
    private float promien;
    private String kolor;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPromien(float promien) {
        this.promien = promien;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Kolo(String nazwa, float promien, String kolor) {
        this.nazwa = nazwa;
        this.promien = promien;
        this.kolor = kolor;
    }
    
    private float obliczObwod(){
        return 2 * 3.14f * promien;
    }
    
    private float obliczPole(){
        return 3.14f * promien * promien;
    }
    
    public void pokazDane(){
        System.out.println("Typ figury: kolo");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Dlugosc promienia: " + promien);
        System.out.println("Kolor: " + kolor);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Obwod: " + obliczObwod());
    }
}
