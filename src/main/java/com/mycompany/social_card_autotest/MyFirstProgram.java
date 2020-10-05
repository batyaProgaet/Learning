/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.social_card_autotest;

/**
 * @author berestov
 */
public class MyFirstProgram {



}


class Student {
    private String lastname;
    private int[] marks;
    private String[] subjects;


    public String Get_Lastname() {
        return lastname;
    }

    public void Red_Lastname(String NewLastname) {
        lastname = NewLastname;
    }

    public int Get_marks(int i) {
        return marks[i];
    }

    public void Red_marks(int i, int value) {
        marks[i] = value;
    }

    public void Show_marks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public String Get_subject(int i) {
        return subjects[i];
    }

    public void Red_subject(int i, String value) {
        subjects[i] = value;
    }

    public void Show_subjects() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }
    }


    public void Create_subject_mark(String subj, int mark) {
        this.marks = new int[marks.length];
        this.subjects = new String[subjects.length];
        marks[marks.length - 1] = mark;
        subjects[subjects.length - 1] = subj;
    }


}


class MySecondClass {


}

