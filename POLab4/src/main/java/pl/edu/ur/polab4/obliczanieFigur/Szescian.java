package pl.edu.ur.polab4.obliczanieFigur;

public class Szescian {
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

    public Szescian(String nazwa, float dlBoku, String kolor) {
        this.nazwa = nazwa;
        this.dlBoku = dlBoku;
        this.kolor = kolor;
    }
    
    private float obliczPoleCalkowite(){
        return 6 * dlBoku * dlBoku;
    }
    
    private float obliczObjetosc(){
        return dlBoku * dlBoku * dlBoku;
    }
    
    public void pokazDane(){
        System.out.println("Typ figury: szescian");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Dlugosc boku: " + dlBoku);
        System.out.println("Kolor: " + kolor);
        System.out.println("Pole calkowite: " + obliczPoleCalkowite());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
