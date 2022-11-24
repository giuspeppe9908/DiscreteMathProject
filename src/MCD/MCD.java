package mcd;
public class MCD {
    public static int GCD(int a, int b){
        int resto;
        resto = (a % b);
        while(resto>0){
            a = b;
            b = resto;
            resto = (a % b);
        }
        return b;
    }
}
