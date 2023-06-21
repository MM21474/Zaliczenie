package Paczka1;


public class Manager extends Pracownik {
    private String wydzial;
    // Klasa reprezentujaca Managera
    public Manager(String imie, String nazwisko, int wiek, String wydzial) {
        super(imie, nazwisko, wiek);
        this.wydzial = wydzial;
    }

    public String getWydzial() {
        return wydzial;
    }

    public void setwydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    // Metoda do wyświetlania informacji o managerze
    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Dział: " + wydzial);
    }
}