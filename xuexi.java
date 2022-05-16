package text_5_15;

import java.util.Scanner;

public class xuexi {
    public static void main(String[] args) {
//        百钱百鸡
        int x,y,z;
        for(x=0;x<20;x++)
        {
            for(y=0;y<33;y++)
            {
                z=100-x-y;
                if((15*x)+(9*y)+(z)==300)
                    System.out.println("x:"+x+"y:"+y+"z:"+z);
            }
        }
    }

}
