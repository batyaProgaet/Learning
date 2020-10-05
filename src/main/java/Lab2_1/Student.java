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

class Student {
    private String lastname;
    private int[] marks;
    private String[] subjects;

    public Student(String lastname, int size) {
        this.lastname = lastname;
        marks = new int[size];
        subjects = new String[size];


    }


    public String GetLastname() {
        return lastname;
    }

    public void RedLastname(String NewLastname) {
        lastname = NewLastname;
    }

    public int GetMarks(int i) {
        return marks[i];
    }

    public void RedMarks(int i, int value) {
        marks[i] = value;
    }

    public void ShowMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public String GetSubject(int i) {
        return subjects[i];
    }

    public void RedSubject(int i, String value) {
        subjects[i] = value;
    }

    public void ShowSubjects() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }
    }


    public int GetLengths() {
        return subjects.length;
    }


    public void CreateSubjectMark(String subj, int mark) {
        this.marks = new int[marks.length];
        this.subjects = new String[subjects.length];
        marks[marks.length - 1] = mark;
        subjects[subjects.length - 1] = subj;
    }


}
