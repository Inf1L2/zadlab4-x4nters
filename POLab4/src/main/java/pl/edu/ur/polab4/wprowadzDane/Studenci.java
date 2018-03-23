package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

public class Studenci {
    private Student[] studenciTab = new Student[100];
    
    public void wypelnijTablice(){
        for (int i=0; i<100; i++){
            studenciTab[i] = new Student("","",0,"",0);
        }
    }
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        
        while (menu != 0){
            System.out.println("Menu > Zadanie 5 >");
            System.out.println(" [ 1 ] Wprowadz dane studenta");
            System.out.println(" [ 2 ] Edycja danych studenta");
            System.out.println(" [ 3 ] Usuniecie danych studenta");
            System.out.println(" [ 4 ] Wyswietlenie danych studenta");
            System.out.println(" [ 5 ] Wyswietlenie danych wszystkich studentow");
            System.out.println(" [ 6 ] Wyswietlenie danych studentow z zakresu");
            System.out.print("Zadanie 5 > ");
            menu = scanner.nextInt();
            
            switch (menu){
                case 1: wprowadz(); break;
                case 2: edycja(); break;
                case 3: usun(); break;
                case 4: wyswietlStudenta(); break;
                case 5: pokazDane(); break;
                case 6: wyswietlZakres(); break;
                case 0: break;
            }
        }
    }
    
    private void wprowadz(){
        Scanner scannerImie = new Scanner(System.in);
        Scanner scannerNazwisko = new Scanner(System.in);
        Scanner scannerNazwaSpecjalnosci = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 5 > Wprowadz dane >");
        System.out.print(" Podaj indeks tablicy: ");
        int index = scanner.nextInt();
        
        System.out.print(" Imie: ");
        studenciTab[index].setImie(scannerImie.nextLine());
        System.out.print(" Nazwisko: ");
        studenciTab[index].setNazwisko(scannerNazwisko.nextLine());
        System.out.print(" Nr indeksu: ");
        studenciTab[index].setNr_indeksu(scanner.nextInt());
        System.out.print(" Nazwa specjalnosci: ");
        studenciTab[index].setNazwaSpecjalnosci(scannerNazwaSpecjalnosci.nextLine());
        System.out.print(" Rok studiow: ");
        studenciTab[index].setRok_studiow(scanner.nextInt()); 
    }
    
    private void edycja(){
        Scanner scannerImie = new Scanner(System.in);
        Scanner scannerNazwisko = new Scanner(System.in);
        Scanner scannerNazwaSpecjalnosci = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 5 > Edytuj dane >");
        System.out.print(" Podaj indeks tablicy: ");
        int index = scanner.nextInt();
        
        System.out.println(" Aktualne imie: " + studenciTab[index].getImie());
        System.out.print(" Imie: ");
        studenciTab[index].setImie(scannerImie.nextLine());
        System.out.println(" Aktualne nazwisko: " + studenciTab[index].getNazwisko());
        System.out.print(" Nazwisko: ");
        studenciTab[index].setNazwisko(scannerNazwisko.nextLine());
        System.out.println(" Aktualny nr indeksu: " + studenciTab[index].getNr_indeksu());
        System.out.print(" Nr indeksu: ");
        studenciTab[index].setNr_indeksu(scanner.nextInt());
        System.out.println(" Aktualna nazwa specjalnosci: " + studenciTab[index].getNazwaSpecjalnosci());
        System.out.print(" Nazwa specjalnosci: ");
        studenciTab[index].setNazwaSpecjalnosci(scannerNazwaSpecjalnosci.nextLine());
        System.out.println(" Aktualny rok studiow: " + studenciTab[index].getRok_studiow());
        System.out.print(" Rok studiow: ");
        studenciTab[index].setRok_studiow(scanner.nextInt()); 
    }
    
    private void usun(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 5 > Usun dane >");
        System.out.print(" Podaj indeks tablicy: ");
        int index = scanner.nextInt();
        
        studenciTab[index].setImie("");
        studenciTab[index].setNazwisko("");
        studenciTab[index].setNr_indeksu(0);
        studenciTab[index].setNazwaSpecjalnosci("");
        studenciTab[index].setRok_studiow(0);
    }
    
    private void wyswietlStudenta(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 5 > Wyswietl dane studenta >");
        System.out.print(" Podaj indeks tablicy: ");
        int index = scanner.nextInt();
        
        System.out.println("Index: " + index);
        System.out.println("Imie: " + studenciTab[index].getImie());
        System.out.println("Nazwisko: " + studenciTab[index].getNazwisko());
        System.out.println("Nr indeksu: " + studenciTab[index].getNr_indeksu());
        System.out.println("Nazwa specjalnosci: " + studenciTab[index].getNazwaSpecjalnosci());
        System.out.println("Rok studiow: " + studenciTab[index].getRok_studiow());
        System.out.println();
    }
    
    private void pokazDane(){
        for (int i=0; i<100; i++){
            System.out.println("====================");
            System.out.println("Index: " + i);
            System.out.println("Imie: " + studenciTab[i].getImie());
            System.out.println("Nazwisko: " + studenciTab[i].getNazwisko());
            System.out.println("Nr indeksu: " + studenciTab[i].getNr_indeksu());
            System.out.println("Nazwa specjalnosci: " + studenciTab[i].getNazwaSpecjalnosci());
            System.out.println("Rok studiow: " + studenciTab[i].getRok_studiow());
            System.out.println();
        }
    }
    
    private void wyswietlZakres(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 5 > Wyswietl zakres danych >");
        System.out.print(" Podaj poczatkowy indeks tablicy: ");
        int indexStart = scanner.nextInt();
        System.out.print(" Podaj koncowy indeks tablicy: ");
        int indexStop = scanner.nextInt();
        
        for (int i = indexStart; i<=indexStop; i++){
            System.out.println("====================");
            System.out.println("Index: " + i);
            System.out.println("Imie: " + studenciTab[i].getImie());
            System.out.println("Nazwisko: " + studenciTab[i].getNazwisko());
            System.out.println("Nr indeksu: " + studenciTab[i].getNr_indeksu());
            System.out.println("Nazwa specjalnosci: " + studenciTab[i].getNazwaSpecjalnosci());
            System.out.println("Rok studiow: " + studenciTab[i].getRok_studiow());
            System.out.println();
        }
    }
}
