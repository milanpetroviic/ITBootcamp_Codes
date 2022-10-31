package Nedelja4.DomaciNedelja.Zadatak2;

public class Boca {
    int zapremina = 0;

    Boca(int v){
        this.zapremina = v;
    }
    public int getZapremina(){
        return zapremina;
    }
    public String toString(){
        return "Zapremina boce je: " + getZapremina();
    }
}
