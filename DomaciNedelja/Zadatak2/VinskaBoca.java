package Nedelja4.DomaciNedelja.Zadatak2;

public class VinskaBoca extends Boca{
    String nazivVina;


    VinskaBoca(String nazivVina, int V) {
        super(V);
        this.nazivVina = nazivVina;
        if (V == zapremina)
            System.out.println("Zapremina boce i vinske boce su jednake.");
    }

    public String getNazivVina(){
        return nazivVina;
    }
    public String toString(){
        return super.toString() + ", a naziv je: " + getNazivVina();
    }
}
