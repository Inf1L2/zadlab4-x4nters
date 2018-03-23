package pl.edu.ur.polab4.obliczanieFigur;

public class Kula {
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

    public Kula(String nazwa, float promien, String kolor) {
        this.nazwa = nazwa;
        this.promien = promien;
        this.kolor = kolor;
    }
    
    private float obliczPole(){
        return 4f * 3.14f * promien * promien;
    }
    
    private float obliczObjetosc(){
        return 4f / 3f * ( 3.14f * promien * promien * promien );
    }
    
    public void pokazDane(){
        System.out.println("Typ figury: kula");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Dlugosc promienia: " + promien);
        System.out.println("Kolor: " + kolor);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
