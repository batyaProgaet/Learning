package Lab1_3;
/*
Задание 3
Измените исходный код таким образом, чтобы ваша фамилия была выведена в столбик по буквам. Буквы фамилии должны задаваться как параметры командной строки.
Откомпилируйте и запустите программу, добавив в командную строку ряд аргументов. Например, следующим образом: “java MyFirstClass И в а н о в”.
*/



public class MyFirstProgram {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }



    }

}