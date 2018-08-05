package clinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    static void mainMenu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("*** MENU ***");
            System.out.println();
            System.out.println("1. Dodaj pacjenta");
            System.out.println("2. Dodaj lekarza");
            System.out.println("3. Umów wizytę");
            System.out.println("4. Wyświetl wizyty");
            System.out.println("5. Zakończ program");
            String user_input = input.next();
            switch (user_input) {
                case "1":
                    dodajPacjenta();
                    System.out.println(Pacjent.listaPacjentow);
                    break;
                case "2":
                    dodajLekarza();
                    System.out.println(Lekarz.lista_lekarzy);
                    break;
                case "3":
                    umowWizyte();
                    break;
                case "4":
                    wyswietlWizyty();
                    break;
                case "5":
                    System.out.println();
                    System.out.println("*** KONIEC PROGRAMU ***");
                    System.exit(0);
            }


        }
    }

    static void dodajPacjenta() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj imie i nazwisko: ");
        String string = input.nextLine();
        String imie = string.split(" ")[0];
        String nazwisko = string.split(" ")[1];
        System.out.print("Podaj adres [ulica numer domu kod pocztowy miejscowość]: ");
        string = input.nextLine();
        String ulica = string.split(" ")[0];
        String numer_domu = string.split(" ")[1];
        String kod_pocztowy = string.split(" ")[2];
        String miasto = string.split(" ")[3];
        DaneAdresowe adres = new DaneAdresowe(ulica, numer_domu, kod_pocztowy, miasto);
        Pacjent pacjent = new Pacjent(imie, nazwisko, adres);
    }

    static void umowWizyte() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj ID pacjenta: ");
        String id_pacjenta = input.next();
        List<String> test_list = new ArrayList<>();
        for (Pacjent pacjent : Pacjent.listaPacjentow) {
            if (id_pacjenta.equals(pacjent.getID())) {
                test_list.add(pacjent.getID());
            }
        }
        System.out.print("Podaj ID lekarza: ");
        String id_lekarza = input.next();
        for (Lekarz lekarz : Lekarz.lista_lekarzy) {
            if (id_lekarza.equals(lekarz.getID())) {
                test_list.add(lekarz.getID());
            }
        }
        if (test_list.size() == 2) {
            Wizyty.kolejka_wizyt.add(new Wizyty(test_list.get(0), test_list.get(1)));
        } else {
            System.out.println("Błędne dane!");
        }
    }

    static void wyswietlWizyty() {
        System.out.println();
        System.out.println("**** LISTA WIZYT ****");
        System.out.println(Wizyty.kolejka_wizyt);
        System.out.println();
    }


    static void dodajLekarza() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj imie i nazwisko: ");
        String line = input.nextLine();
        String imie = line.split(" ")[0];
        String nazwisko = line.split(" ")[1];
        System.out.print("Podaj specjalizacje: ");
        String specjalizacja = input.nextLine();
        System.out.print("Podaj adres [ulica numer domu kod pocztowy miejscowość]: ");
        line = input.nextLine();
        String ulica = line.split(" ")[0];
        String numer_domu = line.split(" ")[1];
        String kod_pocztowy = line.split(" ")[2];
        String miasto = line.split(" ")[3];
        DaneAdresowe adres = new DaneAdresowe(ulica, numer_domu, kod_pocztowy, miasto);
        Lekarz lekarz = new Lekarz(imie, nazwisko, specjalizacja, adres);
    }


}
