package com.Andrej;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    List<Fakultet> list = new ArrayList<>();
        Fakultet fakultet1 = new Fakultet("FIKT", 10, 150);
        Fakultet fakultet2 = new Fakultet("Biotehnicki", 10, 100);
        Fakultet fakultet3 = new Fakultet("Pedagoski ", 20, 200);
        Fakultet fakultet4 = new Fakultet("Medicinski", 25, 70);
        Fakultet fakultet5 = new Fakultet("Tehnicki", 10, 200);
        list.add(fakultet1);
        list.add(fakultet2);
        list.add(fakultet3);
        list.add(fakultet4);
        list.add(fakultet5);
        for(Fakultet f : list) {
            System.out.println(
                    "Ime na fakultet: " + f.getIme()+
                    " Broj na smerovi: " + f.getBrNaSmerovi() +
                    " Broj na studenti: " + f.getBrNaStudenti());
        }
    }
}
