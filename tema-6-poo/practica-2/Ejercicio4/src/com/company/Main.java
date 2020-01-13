package com.company;
import MisClases.*;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Asiento asientos[] = new Asiento[3];
        asientos[0] = new Asiento(1, true, "a");
        asientos[1] = new Asiento(2, false, "b");
        asientos[2] = new Asiento(3, true, "a");
        for (int i = 0; i < asientos.length ; i++) {
            System.out.println(asientos[i]);

        }



    }
}
