package pl.edu.ur.polab4.obliczanieFigur;

public class Stozek {
    private String nazwa;
    private float promienPodstawy;
    private float wysokosc;
    private float tworzaca;
    private String kolor;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPromienPodstawy(float promienPodstawy) {
        this.promienPodstawy = promienPodstawy;
    }

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void setTworzaca(float tworzaca) {
        this.tworzaca = tworzaca;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Stozek(String nazwa, float promienPodstawy, float wysokosc, float tworzaca, String kolor) {
        this.nazwa = nazwa;
        this.promienPodstawy = promienPodstawy;
        this.wysokosc = wysokosc;
        this.tworzaca = tworzaca;
        this.kolor = kolor;
    }
    
    private float obliczPoleCalkowite(){
        return 3.14f * promienPodstawy * ( promienPodstawy + tworzaca );
    }
    
    private float obliczObjetosc(){
        return 1f / 3f * ( 3.14f * promienPodstawy * promienPodstawy * wysokosc );
    }
    
    public void pokazDane(){
        System.out.println("Typ figury: stozek");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Dlugosc promienia podstawy: " + promienPodstawy);
        System.out.println("Wysokosc stozka: " + wysokosc);
        System.out.println("Dlugosc tworzacej stozka: " + tworzaca);
        System.out.println("Kolor: " + kolor);
        System.out.println("Pole calkowite: " + obliczPoleCalkowite());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
