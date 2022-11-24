package convertions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
    int Hex = 16;
    public String Convert(int number, int radix ) {
        String res = "";
        int rem;
        while(number > 0){
            rem = number % radix;
            if(radix == Hex){
                if(rem == 10){
                    res += 'A';
                }
                else if(rem == 11){
                    res += 'B';
                }
                else if(rem == 12){
                    res += 'C';
                }
                else if(rem == 13){
                    res += 'D';
                }
                else if(rem == 14){
                    res += 'E';
                }
                else if(rem == 15){
                    res += 'F';
                }
                else res += rem;
            }else res += rem;
            number /= radix;
        }
        return new StringBuffer(res).reverse().toString();
    }

}
