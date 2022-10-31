package Nedelja4.DomaciNedelja.Zadatak1;

public class Televizor {
    int jacinaTona = 0;
    int trenutniProgram = 1;
    boolean ukljucen = false;

    Televizor(int jacinaTona, int trenutniProgram, boolean ukljucen) {
        this.jacinaTona = jacinaTona;
        this.trenutniProgram = trenutniProgram;
        this.ukljucen = ukljucen;
    }

    public boolean getUkljuci () {
        ukljucen = true;
        return ukljucen;
    }
    public boolean getIskljuci () {
        ukljucen = false;
        return ukljucen;
    }
    public int getPojacajTon () {
        jacinaTona = jacinaTona + 1;
        return jacinaTona;
    }
    public int getSmanjiTon () {
        jacinaTona = jacinaTona - 1;
        return jacinaTona;
    }
    public int getIskljuciTon () {
        jacinaTona = 0;
        return jacinaTona;
    }
    public int getPromeniProgramNavise () {
        trenutniProgram += 1;
        return trenutniProgram;
    }
    public int getPromeniProgramNanize () {
        trenutniProgram -= 1;
        return trenutniProgram;
    }
    public int getVratiTrenutniProgram () {
        return trenutniProgram;
    }
    public int getVratiJacinuTona () {
        return jacinaTona;
    }
    public boolean getDaLiJeUkljucen () {
        return ukljucen;
    }
    public String toString () {
        return "Da li je ukljucen: " + getUkljuci() + "\n" + "Da li je iskljucen: " + getIskljuci() + "\n" + "Pojacan ton: " + getPojacajTon() + "\n" + "Smanjen ton: " + getSmanjiTon() +
                "\n" + "Iskljucen ton: " + getIskljuciTon() + "\n" + "Program navise: " + getPromeniProgramNavise() + "\n" +
                "Program nanize: " + getPromeniProgramNanize() + "\n" + "Trenutni program: " + getVratiTrenutniProgram() + "\n" +
                "Jacina tona: " + getVratiJacinuTona() + "\n" + "Da li je ukljucen: " + getDaLiJeUkljucen();
    }
}



