package pl.edu.ur.polab4;
import java.util.Scanner;
// TODO zad 4, 5
public class Main {
    private static void zadanie4(){
        
    }

    private static void zadanie5(){

    }

    public static void main(String[] args) {
        int menu = 1;

        while (menu != 0){
            System.out.println("Menu > Wybierz >");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 5 ] Zadanie 5");
            System.out.print("Menu > ");

            switch (menu){
                case 4: zadanie4(); break;
                case 5: zadanie5(); break;
                case 0: break;
            }
        }
    }
}
