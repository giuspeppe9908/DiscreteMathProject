import bezout.IdBezout;
import convertions.Convert;
import generatori.Generatori;
import gruppiciclici.CycleGroup;
import linearCongruences.LinCongr;

import java.math.BigInteger;
import java.util.Scanner;
public class MathLib {
    public static void MCDAndBezout(){
        IdBezout bezout = new IdBezout();
        bezout.MCDAndBezout();
    }
    public static void GeneratoriZn() {
        System.out.println("################## GENERATORI Zn #################");
        Generatori gen = new Generatori();
        gen.GeneratoriZn();
        System.out.println("##################################################");
    }
    public static void LinearCongruenceSolver() {
        LinCongr linCongr = new LinCongr();
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci a : ");
        int a = tasto.nextInt();
        System.out.println("Inserisci b : ");
        int b = tasto.nextInt();
        System.out.println("Inserisci n : ");
        int n = tasto.nextInt();
        linCongr.Calculate(a,b,n);
    }

    public void CycleGroups() {
        CycleGroup cg = new CycleGroup();
        Scanner tasto = new Scanner(System.in);
        System.out.println("Primo Gruppo : ");
        int firstG = tasto.nextInt();
        System.out.println("Second Gruppo : ");
        int secondG = tasto.nextInt();
        boolean ris = cg.AreTheyCycles(firstG, secondG);
        System.out.print("Risultato calcolo : Z"+firstG+" x Z"+secondG+" = ");
        System.out.println(ris ? "CICLICI" : "NON CICLICI");
    }

    public void ConversionBasetoBase() {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Numero da convertire : ");
        int numeroToConvert = tasto.nextInt();
        System.out.println("Dammi base : ");
        int baseNuova = tasto.nextInt();
        System.out.println("Vuoi convertire il numero : "+numeroToConvert+" in base "+baseNuova);
        Convert conv = new Convert();
        String numeroConverted = conv.Convert(numeroToConvert, baseNuova);
        System.out.println("["+numeroToConvert+"]10 = ["+numeroConverted+"]"+baseNuova);
    }
}
