package gruppiciclici;

import mcd.MCD;
public class CycleGroup {

    public boolean AreTheyCycles(int firstG, int secondG){
        boolean res = false;
        int d = MCD.GCD(firstG,secondG);
        if(d == 1) res = true;
        return res;
    }

}
