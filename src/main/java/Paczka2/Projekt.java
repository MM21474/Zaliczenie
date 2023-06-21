package Paczka2;

// Klasa reprezentująca Projekt
public class Projekt {
    private String nazwa;
    private String opis;

    public Projekt(String nazwa, String opis) {
        this.nazwa = nazwa;
        this.opis = opis;
    }

    // Gettery i settery

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    // Metoda do wyświetlania informacji o projekcie

    public void wyswietlInformacje() {
        System.out.println("Nazwa projektu: " + nazwa);
        System.out.println("Opis projektu: " + opis);
    }
}