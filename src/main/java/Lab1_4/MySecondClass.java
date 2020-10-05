package Lab1_4;
/*
В том же файле MyFirstProgram.java после описания класса MyFirstClass добавьте описание второго класса MySecondClass, реализующего следующую функциональность:
•	имеет поле, которое описывает одномерный массив целых чисел;
•	метод для получения значения элемента массива;
•	метод для модификации значения элемента массива;
•	конструктор, создающий объект массива заданного размера и инициализирующий его элементы случайными числами;
•	метод, обеспечивающий вывод элементов массива на экран.
Код метода main() MyFirstClass должен обеспечивать создание объекта типа MySecondClass, замену первого элемента массива на заданное число и вывод на экран элементов массива.
Добейтесь работоспособности программы.
 */
public class MySecondClass {



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
