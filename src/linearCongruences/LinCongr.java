package linearCongruences;

import mcd.MCD;

public class LinCongr {

    public static int[] ExtendedEuclideanAlgo(int a, int b){
        if(a == 0){
            return new int[]{b, 0, 1};
        }else{
            int x1=1, y1=1;
            int gcdy[] = ExtendedEuclideanAlgo(b % a, a);
            int gcd = gcdy[0];
            x1 = gcdy[1];
            y1 = gcdy[2];
            int y = y1;
            int x = y1 - (int)Math.floor(b/a) * x1;
            return new int[]{gcd, x, y};
        }
    }

    //TODO : functions
    public void Calculate(int x, int y, int N){
        x = x % N;
        y = y % N;
        int u=0, v = 0;
        int evaluate[] = ExtendedEuclideanAlgo(x,N);
        int d = evaluate[0];
        u = evaluate[1];
        v = evaluate[2];
        if(y % d != 0) {
            System.out.println(-1);
            return;
        }

        int x0 = (u * (y / d)) % N;
        if(x0 < 0) x0 += N;

        System.out.println("Stampo tutte le soluzioni : ");
        for(int i=0; i <= d -1; i++){
            int an = (x0 + i * (N / d)) % N;
            System.out.println(an+" ");
        }
    }
}
