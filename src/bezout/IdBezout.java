package bezout;

import mcd.MCD;

import java.util.Scanner;

public class IdBezout {
    public void MCDAndBezout(){
        Scanner tasto = new Scanner(System.in);
        System.out.println("Teoria di MCD & Identità di Bezout:\n" +
                "MCD o Maggior Divisore Comune è quel numero > 0 comune a due interi a e b.\n" +
                "Identità di Bezout : Meccanismo attraverso il quale si può, dopo aver calcolato l'MCD, trovare x e y di due interi che \n" +
                "sottratti fra loro danno come risultato l'MCD calcolato.");
        System.out.println("Per iniziare : fornire due interi > 0 ");
        int a,b;
        System.out.println("Fornire primo intero : ");
        a = tasto.nextInt();
        System.out.println("Fornire secondo intero : ");
        b = tasto.nextInt();
        if(a == b) System.out.println("MCD tra uno stesso numero è se stesso : "+a);
        else{
            int d = MCD.GCD(a,b);
            System.out.println("MCD("+a+","+b+") = "+d);
            Bezout(d,a,b);
        }
    }

    public static void Bezout(int d, int a, int b) {
        System.out.println("Calcolo identità di Bezout tra "+a+" e "+b+" ...");
        int A=a,B=b;
        int x = 0, y = 1, lastx = 1, lasty = 0, temp;
        while (b != 0)
        {
            int q = a / b;
            int r = a % b;
            a = b;
            b = r;
            temp = x;
            x = lastx - q * x;
            lastx = temp;
            temp = y;
            y = lasty - q * y;
            lasty = temp;
        }
        System.out.println("Soluzione : "+lastx+" * "+A+" "+lasty+" * "+B);
    }
}
