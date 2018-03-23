package pl.edu.ur.polab4.obliczanieFigur;

public class Prostokat {
    private String nazwa;
    private float dlBokuA;
    private float dlBokuB;
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

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Prostokat(String nazwa, float dlBokuA, float dlBokuB, String kolor) {
        this.nazwa = nazwa;
        this.dlBokuA = dlBokuA;
        this.dlBokuB = dlBokuB;
        this.kolor = kolor;
    }
    
    private float obliczPole(){
        return dlBokuA * dlBokuB;
    } 
    
    private float obliczObwod(){
        return (2 * dlBokuA) + (2 * dlBokuB);
    }
    
    public void pokazDane(){
        System.out.println("Typ figury: prostokat");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Dlugosc boku a: " + dlBokuA);
        System.out.println("Dlugosc boku b: " + dlBokuB);
        System.out.println("Kolor: " + kolor);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Obwod: " + obliczObwod());
    }
}
