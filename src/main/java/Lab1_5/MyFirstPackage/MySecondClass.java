package Lab1_5.MyFirstPackage;
/*
Вынесите код класса MySecondClass без изменений в отдельный файл с
именем MyFirstPackage.java, и поместите его в поддиректорию MyFirstPackage.
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

    int GetI(int i) {
        return x[i];
    }

    void RedactI(int i, int value) {
        x[i] = value;
    }

    void Show() {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
