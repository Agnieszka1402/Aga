package pl.sda.samochod;

public class JazdaTestowa {
    public static void main(String[] args) {
        Samochod bmw = new Samochod();
        Samochod fiat = new Samochod();

        bmw.jedz();
        System.out.println("BMW "+ bmw.stanLicznika());
        System.out.println("Fiat " + fiat.stanLicznika());
        bmw.jedz();
        bmw.jedz();
        fiat.jedz();
        bmw.jedz();
        System.out.println("BMW " + bmw.stanLicznika());
        System.out.println("Fiat " + fiat.stanLicznika());


    }
}
