package pl.sda.samochod;

public class Samochod {
    int przebieg =0;
    boolean jestwruchu = false;
    public void jedz(){
        jestwruchu = true;
    przebieg = przebieg + 1;

    }
    public void stoj(){
        jestwruchu = false;


    }
    public int stanLicznika(){
    return przebieg;
    }
}
