package pl.edu.ur.polab4.obliczanieFigur;

public class Kwadrat {
    private String nazwa;
    private float dlBoku;
    private String kolor;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setDlBoku(float dlBoku) {
        this.dlBoku = dlBoku;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Kwadrat(String nazwa, float dlBoku, String kolor) {
        this.nazwa = nazwa;
        this.dlBoku = dlBoku;
        this.kolor = kolor;
    }
    
    private float obliczPole(){
        return dlBoku * dlBoku;
    } 
    
    private float obliczObwod(){
        return 4 * dlBoku;
    }
    
    public void pokazDane(){
        System.out.println("Typ figury: kwadrat");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Dlugosc boku: " + dlBoku);
        System.out.println("Kolor: " + kolor);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Obwod: " + obliczObwod());
    }
}
