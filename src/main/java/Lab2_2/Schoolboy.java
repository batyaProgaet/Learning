package Lab2_2;
/*

Написать класс Schoolboy (или Schoolgirl),
реализующий функциональность, сходную с классом из задания 1.
Оценки и предметы должны быть представлены полями внутреннего класса Register,
класс Schoolboy хранит массив Register'ов.


*/

import com.sun.org.apache.xpath.internal.operations.String;

public class Schoolboy {
    String fistname; // Фамилия студента
    Register[] reg;


    // что значит функциональность, схожу с классом?



    private class Register{
        int marks[]; // оценки
        String[] subjects;
    }


}
