/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.social_card_autotest;

/**
 *
 * @author berestov
 */
public class MyFirstProgram {

    public static void main(String[] args) {

        /*
        Задание 3.
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
         */
        MySecondClass M = new MySecondClass(6);
        M.Show();
        System.out.println(M.get_i(0));
        M.redact_i(0, 2);
    }

}

class MySecondClass {

    private int[] x;

    public MySecondClass(int lenght) {
        this.x = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            x[i] = (int) Math.round(Math.random() * 10);
        }
    }

    int get_i(int i) {
        return x[i];
    }

    void redact_i(int i, int value) {
        x[i] = value;
    }

    void Show() {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
