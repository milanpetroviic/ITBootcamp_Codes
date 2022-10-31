package Nedelja4.DomaciNedelja.Zadatak2;

public class RonilackaBoca extends Boca{
    int masa;

    RonilackaBoca(int masa, int V){
        super(V);
        this.masa = masa;
        if (zapremina == V)
            System.out.println("Zapremina boce i ronilacke boce su jednake.");
    }

    public int getMasa(){
        return masa;
    }
    public String toString(){
        return super.toString() + ", a masa je: " + getMasa();
    }
}
