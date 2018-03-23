package pl.edu.ur.polab4.wprowadzDane;

public class Student {
    private String imie;
    private String nazwisko;
    private int nr_indeksu;
    private String nazwaSpecjalnosci;
    private int rok_studiow;

    
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getNr_indeksu() {
        return nr_indeksu;
    }
    public String getNazwaSpecjalnosci() {
        return nazwaSpecjalnosci;
    }
    public int getRok_studiow() {
        return rok_studiow;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }
    public void setNazwaSpecjalnosci(String nazwaSpecjalnosci) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }
    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }

    
    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Student(String imie, String nazwisko, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }
    public Student(String imie, String nazwisko, int nr_indeksu, String nazwaSpecjalnosci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }
    public Student(String imie, String nazwisko, int nr_indeksu, String nazwaSpecjalnosci, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.rok_studiow = rok_studiow;
    }
    
    
    public void pokazDane(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Nr indeksu: " + nr_indeksu);
        System.out.println("Nazwa specjalnosci: " + nazwaSpecjalnosci);
        System.out.println("Rok studiow: " + rok_studiow);
    }
}
