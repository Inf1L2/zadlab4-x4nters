package pl.edu.ur.polab4.obliczanieFigur;

public class Prostopadloscian {
    private String nazwa;
    private float dlBokuA;
    private float dlBokuB;
    private float dlBokuC;
    private String kolor;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setDlBokuA(float dlBokuA) {
        this.dlBokuA = dlBokuA;
    }

    public void setDlBokuB(float dlBokuB) {
        this.dlBokuB = dlBokuB;
    }

    public void setDlBokuC(float dlBokuC) {
        this.dlBokuC = dlBokuC;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Prostopadloscian(String nazwa, float dlBokuA, float dlBokuB, float dlBokuC, String kolor) {
        this.nazwa = nazwa;
        this.dlBokuA = dlBokuA;
        this.dlBokuB = dlBokuB;
        this.dlBokuC = dlBokuC;
        this.kolor = kolor;
    }
    
    private float obliczPoleCalkowite(){
        return 2 * ( dlBokuA * dlBokuB ) + 2 * ( dlBokuB * dlBokuC ) + 2 * ( dlBokuA * dlBokuC );
    }
    
    private float obliczObjetosc(){
        return dlBokuA * dlBokuB * dlBokuC;
    }
    
    public void pokazDane(){
        System.out.println("Typ figury: prostopadloscian");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Dlugosc boku a: " + dlBokuA);
        System.out.println("Dlugosc boku b: " + dlBokuB);
        System.out.println("Dlugosc boku c: " + dlBokuC);
        System.out.println("Kolor: " + kolor);
        System.out.println("Pole: " + obliczPoleCalkowite());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
