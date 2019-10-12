package main_pack;

public class Menu {
    public void show_menu(){

        System.out.println("Введите размер массива: ");
        java.util.Scanner inp = new java.util.Scanner(System.in);
        int length = inp.nextInt();
        Arras arr = new Arras(length);

        String info_menu = "1. Ввести массив вручную\n2. Заполнить случайными числами\n" +
                "3. Вывести слева направо\n4. Вывести справа на лево\n" +
                "5. Уменьшить значения элементов массива, расположенных на нечетных местах на заданное значение.\n" +
                "6. Сформировать новый массив из тех чисел исходного массива, у которых в двоичном коде больше трех единиц.\n" +
                "7. Выход из приложения\n";

        int num_menu;


        boolean oleglox = true;
        while (oleglox){
            System.out.print(info_menu);
            num_menu = inp.nextInt();
            switch (num_menu){
                case 1:
                    arr.mInput();
                    break;
                case 2:
                    arr.rInput();
                    break;
                case 3:
                    arr.lOut();
                    break;
                case 4:
                    arr.rOut();
                    break;
                case 5:
                   arr.task_1();
                    break;
                case 6:
                    System.out.println("Готовый массив массив: ");
                    System.out.print(arr.task_2()+ "\n");
                    break;
                case 7:
                    oleglox = false;
                    break;
            }
        }
    }
}