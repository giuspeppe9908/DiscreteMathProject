import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("##################################################");
        System.out.println("BENVENUTO! QUESTO E' UN PROGRAMMA CHE INCLUDE  \n" +
                "ALCUNI PROGRAMMI PER RISOLVERE \nESERCIZI DI MATEMATICA DISCRETA");
        System.out.println("##################################################");
        System.out.println("Menù : \n1 - Verifica Ciclicità Gruppi\n2 - Generatori in (Zn,+)\n3 - MCD & Identità di Bezout\n4 - Calcolatore Congruenze Lineari\n5 - Conversioni da base 10 a base X\n6 - Esci");
        System.out.println("##################################################");
        MathLib lib = new MathLib();
        Scanner tasto = new Scanner(System.in);
        System.out.println("Scelta : ");
        int scelta = tasto.nextInt();
        switch (scelta){
                case 1:
                        lib.CycleGroups();
                        break;
                case 2:
                        lib.GeneratoriZn();
                        break;
                case 3:
                        lib.MCDAndBezout();
                        break;
                case 4:
                        lib.LinearCongruenceSolver();
                        break;
                case 5:
                        lib.ConversionBasetoBase();
                        break;
                case 6:
                        System.out.println("Uscita...");
                        break;
                default:
                        System.out.println("Errore : scelta deve essere da 1 a 5! Riavvia il programma!");
                        break;
        }
        System.out.println("##################################################");
    }

}