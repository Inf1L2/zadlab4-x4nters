package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.wprowadzDane.Student;
import pl.edu.ur.polab4.obliczanieFigur.Kolo;
import pl.edu.ur.polab4.obliczanieFigur.Kula;
import pl.edu.ur.polab4.obliczanieFigur.Kwadrat;
import pl.edu.ur.polab4.obliczanieFigur.Prostokat;
import pl.edu.ur.polab4.obliczanieFigur.Prostopadloscian;
import pl.edu.ur.polab4.obliczanieFigur.Stozek;
import pl.edu.ur.polab4.obliczanieFigur.Szescian;
import pl.edu.ur.polab4.wprowadzDane.Studenci;

// TODO zad 4, 5
public class Main {
    private static void zadanie2(){
        Student student1 = new Student("Dariusz", "Kozubek", 111111, "Programowanie", 1);
        Student student2 = new Student("Janusz", "Kowalski", 222222);
        Student student3 = new Student("Adam", "Cośtam", 333333, "Bazy danych");
        Student student4 = new Student("Kamil", "Stoch", 444444, "Aplikacje internetowe", 3);
        
        student1.pokazDane();
        student2.pokazDane();
        student3.pokazDane();
        student4.pokazDane();
    }
    
    private static void zadanie4(){
        Scanner scanner = new Scanner(System.in);
        int figura = 1;
        while (figura != 0) {
            System.out.println("Menu > Zadanie 4 > Wybierz figure >");
            System.out.println(" [ 1 ] Kolo");
            System.out.println(" [ 2 ] Kula");
            System.out.println(" [ 3 ] Kwadrat");
            System.out.println(" [ 4 ] Prostokat");
            System.out.println(" [ 5 ] Prostopadloscian");
            System.out.println(" [ 6 ] Stozek");
            System.out.println(" [ 7 ] Szescian");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Wybierz figure > ");
            figura = scanner.nextInt();
            
            switch (figura){
                case 1: zadanie4kolo(); break;
                case 2: zadanie4kula(); break;
                case 3: zadanie4kwadrat(); break;
                case 4: zadanie4prostokat(); break;
                case 5: zadanie4prostopadloscian(); break;
                case 6: zadanie4stozek(); break;
                case 7: zadanie4szescian(); break;
                case 0: break;
            }
        }
    }

    private static void zadanie4kolo(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerKolor = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 4 > Kolo > Podaj parametry >");
        System.out.print(" Nazwa: ");
        String nazwa = scanner.nextLine();
        
        System.out.print(" Promien: ");
        float promien = scanner.nextFloat();
        
        System.out.print(" Kolor: ");
        String kolor = scannerKolor.nextLine();
        
        Kolo kolo1 = new Kolo(nazwa, promien, kolor);
        kolo1.pokazDane();
    }
    
    private static void zadanie4kula(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerKolor = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 4 > Kula > Podaj parametry >");
        System.out.print(" Nazwa: ");
        String nazwa = scanner.nextLine();
        
        System.out.print(" Promien: ");
        float promien = scanner.nextFloat();
        
        System.out.print(" Kolor: ");
        String kolor = scannerKolor.nextLine();
        
        Kula kula1 = new Kula(nazwa, promien, kolor);
        kula1.pokazDane();
    }
    
    private static void zadanie4kwadrat(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerKolor = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 4 > Kwadrat > Podaj parametry >");
        System.out.print(" Nazwa: ");
        String nazwa = scanner.nextLine();
        
        System.out.print(" Dlugosc boku: ");
        float dlBoku = scanner.nextFloat();
        
        System.out.print(" Kolor: ");
        String kolor = scannerKolor.nextLine();
        
        Kwadrat kwadrat1 = new Kwadrat(nazwa, dlBoku, kolor);
        kwadrat1.pokazDane();
    }
    
    private static void zadanie4prostokat(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerKolor = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 4 > Prostokat > Podaj parametry >");
        System.out.print(" Nazwa: ");
        String nazwa = scanner.nextLine();
        
        System.out.print(" Dlugosc boku a: ");
        float dlBokuA = scanner.nextFloat();
        
        System.out.print(" Dlugosc boku b: ");
        float dlBokuB = scanner.nextFloat();
        
        System.out.print(" Kolor: ");
        String kolor = scannerKolor.nextLine();
        
        Prostokat prostokat1 = new Prostokat(nazwa, dlBokuA, dlBokuB, kolor);
        prostokat1.pokazDane();
    }
    
    private static void zadanie4prostopadloscian(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerKolor = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 4 > Prostopadloscian > Podaj parametry >");
        System.out.print(" Nazwa: ");
        String nazwa = scanner.nextLine();
        
        System.out.print(" Dlugosc boku a: ");
        float dlBokuA = scanner.nextFloat();
        
        System.out.print(" Dlugosc boku b: ");
        float dlBokuB = scanner.nextFloat();
        
        System.out.print(" Dlugosc boku c: ");
        float dlBokuC = scanner.nextFloat();
        
        System.out.print(" Kolor: ");
        String kolor = scannerKolor.nextLine();
        
        Prostopadloscian prostopadloscian1 = new Prostopadloscian(nazwa, dlBokuA, dlBokuB, dlBokuC, kolor);
        prostopadloscian1.pokazDane();
    }
    
    private static void zadanie4stozek(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerKolor = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 4 > Stozek > Podaj parametry >");
        System.out.print(" Nazwa: ");
        String nazwa = scanner.nextLine();
        
        System.out.print(" Dlugosc promienia podstawy: ");
        float promienPodstawy = scanner.nextFloat();
        
        System.out.print(" Wysokosc stozka: ");
        float wysokosc = scanner.nextFloat();
        
        System.out.print(" Dlugosc tworzacej stozka: ");
        float tworzaca = scanner.nextFloat();
        
        System.out.print(" Kolor: ");
        String kolor = scannerKolor.nextLine();
        
        Stozek stozek1 = new Stozek(nazwa, promienPodstawy, wysokosc, tworzaca, kolor);
        stozek1.pokazDane();
    }
    
    private static void zadanie4szescian(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerKolor = new Scanner(System.in);
        
        System.out.println("Menu > Zadanie 4 > Szescian > Podaj parametry >");
        System.out.print(" Nazwa: ");
        String nazwa = scanner.nextLine();
        
        System.out.print(" Dlugosc boku: ");
        float dlBoku = scanner.nextFloat();
        
        System.out.print(" Kolor: ");
        String kolor = scannerKolor.nextLine();
        
        Szescian szescian1 = new Szescian(nazwa, dlBoku, kolor);
        szescian1.pokazDane();
    }
    
    private static void zadanie5(){
        Studenci studenci1 = new Studenci();
        studenci1.wypelnijTablice();
        studenci1.menu();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 1;

        while (menu != 0){
            System.out.println("Menu > Wybierz >");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 5 ] Zadanie 5");
            System.out.println(" [ 0 ] Zakoncz");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch (menu){
                case 2: zadanie2(); break;
                case 4: zadanie4(); break;
                case 5: zadanie5(); break;
                case 0: break;
            }
        }
    }
}
