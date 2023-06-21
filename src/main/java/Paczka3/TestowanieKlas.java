package Paczka3;
import Paczka1.*;
import Paczka2.*;

public class TestowanieKlas {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Pracownik
        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 30);

        // Wywołanie metody wyświetlającej informacje o pracowniku
        System.out.println("Informacje o pracowniku:");
        pracownik.wyswietlInformacje();

        System.out.println("-----------------------------");

        // Tworzenie obiektu klasy Manager
        Manager manager = new Manager("Anna", "Nowak", 35, "IT");

        // Wywołanie metody wyświetlającej informacje o managerze
        System.out.println("Informacje o managerze:");
        manager.wyswietlInformacje();

        System.out.println("-----------------------------");

        // Tworzenie obiektu klasy Projekt
        Projekt projekt = new Projekt("System zarządzania", "System do zarządzania projektami");

        // Wywołanie metody wyświetlającej informacje o projekcie
        System.out.println("Informacje o projekcie:");
        projekt.wyswietlInformacje();
    }
}

