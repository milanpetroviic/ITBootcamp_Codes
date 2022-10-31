package Nedelja4.DomaciNedelja.Zadatak2;

public class Main {
    public static void main(String[] args) {
        Boca boca = new Boca(10);
        VinskaBoca vinskaBoca = new VinskaBoca("Sardone", 10);
        RonilackaBoca ronilackaBoca = new RonilackaBoca(50,10);
        System.out.println(boca);
        System.out.println(vinskaBoca);
        System.out.println(ronilackaBoca);
    }
}
