package Lab2_1;

/*
Модифицировать класс MySecondClass из прошлой работы, переименовав его в Student. Он должен содержать:
поле типа String, хранящее фамилию студента, //ок
метод для получения фамилии студента, //ок
метод для модификации фамилии студента, //ок
поле marks, хранящее массив типа int, содержащий оценки по предметам, //ок
метод для получения значения элемента этого массива, //ок
метод для модификации значения элемента массива, // ок
метод, обеспечивающий вывод элементов массива на экран, //ок
поле subjects, хранящее массив типа String, содержащий названия предметов, //ок
метод для получения значения элемента этого массива, //ок
метод для модификации значения элемента массива, //ок
метод, обеспечивающий вывод элементов массива на экран, //ок
метод добавления предмета и оценки в соответствующие массивы с увеличением их длин (путем создания новых массивов), использовать метод Arrays.copyOf(),
метод для получения размера массивов. //ок
Конструктор класса должен принимать в качестве параметров значение фамилии и размер массивов.//ок

*/


import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;

class Student {

    String fistname; // Фамилия студента
    int marks[]; // оценки
    String[] subjects;

    public Student(String fistname, int length) {
        this.fistname = fistname;
        this.marks = new int[length];
        this.subjects = new String[length];
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public int getMarks(int i) {
        return marks[i];
    }

    public void setMarks(int i, int mark) {
        this.marks[i] = mark;
    }

    public void showMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public String getSubjects(int i) {
        return subjects[i];
    }

    public void setSubjects(int i, String subject) {
        this.subjects[i] = subject;
    }

    public void showSubjects() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }
    }

    public void addMarkAndSubject(int mark, String subject) {
        this.marks = Arrays.copyOf(this.marks, this.marks.length);
        this.marks[this.marks.length - 1] = mark;
        this.subjects = Arrays.copyOf(this.subjects, this.subjects.length);
        this.subjects[this.subjects.length - 1] = subject;
    }

    public int getLength() {
        return this.marks.length;
    }


}
