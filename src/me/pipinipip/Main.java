package me.pipinipip;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Hur många tal?"));
        int[] b = new int[c];
        for (int q = 0; q < b.length; q++) {
            b[q] = Integer.parseInt(JOptionPane.showInputDialog(null,"Skriv in ett av talen"));
        }

        for (int i = 0; i < b.length; i++){
            a = b[i]+a;

        }
        System.out.println(a/c);



    }
}