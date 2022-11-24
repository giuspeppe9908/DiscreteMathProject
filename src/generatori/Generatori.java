package generatori;
import mcd.MCD;

import java.util.Scanner;
public class Generatori {

    public void GeneratoriZn(){
        Scanner tasto = new Scanner(System.in);
        System.out.println("NOTA BENE");
        System.out.println("Il seguente programma data una base di Z. Fornisce :\n- Tutti i generatori\n-Il numero totale di essi!\nRicorda che sono chiamati anche INVERTIBILI");
        System.out.println("FUNZIONA SOLO CON LA STRUTTURA (Zn,+)!");
        System.out.print("Dammi base di Zn -> ");
        int base = tasto.nextInt();
        int dim_array = base;
        int[] a = new int[dim_array];
        Riempio_Array(a,0,dim_array);
        //Stampo_Array(a);
        Trovo_Generatori(a,base, dim_array);
        //Le classi resto partono da [0]N e arrivano fino ad [N-1]N
    }

    public static void Riempio_Array(int[]a, int i, int dim){
        int ele = i;
        while(i<dim){
            a[i] = i;
            i=i+1;
        }

    }
    public static void Stampo_Array(int[] a){
        int i=0;
        while(i<a.length){
            System.out.print("["+i+"]");
            i=i+1;
        }
        System.out.println();
    }
    public static void Trovo_Generatori(int[] a, int base_n, int dim){
        int conta = 0, somma_gen = 0;
        int[]gen_base_n = new int[dim];
        int i=0;
        while(i<dim){
            int d = MCD.GCD(a[i], base_n);
            if(d == 1){
                conta = conta + 1;
                gen_base_n[i] = a[i];
                System.out.println("Generatore di "+base_n+" -> "+gen_base_n[i]);
                somma_gen = somma_gen + 1;
            }
            i=i+1;
        }
        System.out.println("Totale dei generatori (o anche elementi invertibili in Z"+dim+") : "+somma_gen);
    }
}
