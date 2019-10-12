package main_pack;

import java.util.ArrayList;

public class Arras {

    int length;
    int[] array;

    //класс создаем
    Arras(int length){
        this.length = length;
        array = new int[this.length];
    }

    // ввод ручками
    public void mInput(){
        java.util.Scanner inp = new java.util.Scanner(System.in);
        System.out.println("Вводите числа массива: ");
        for (int i = 0; i<array.length; i++){
            array[i] = inp.nextInt();
        }
    }

    //рандомный ввод
    public void rInput(){
        for (int i=0; i<length; i++){
            array[i] = 1 + (int)(Math.random() * 1000);
        }
    }

    //вывод слева направо
    public void lOut(){
        for(int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    //вывод справа налево
    public void rOut(){
        for (int i = length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    //Task_1
    public void task_1(){
        System.out.println("Введите необхаодимое число: ");
        java.util.Scanner inp = new java.util.Scanner(System.in);
        int count = inp.nextInt();
         for (int i=0; i<this.length;i+=2){
             array[i]-=count;
         }
         System.out.println("Задание выполнено!");
        }
    private boolean Check_one(int numb) {
        int onlyone = 0;
        while (numb >0){
                if (numb%2==1)
                    onlyone++;
                numb/=2;
                if (onlyone>3){
                    return true;
                }
        }
        if (onlyone>3)
            return true;
        return false;
    }
    public String task_2(){
        //сохраняем в лист
        ArrayList <Integer> numb = new ArrayList();
        int count =0;
        for (int i : array){
            if (Check_one(i)) {
                numb.add(i);
                count++;
            }
        }
        //перезапись
        int [] true_num = new int[count];
        int t = 0;
        for (int i : numb){
            true_num[t] = i;
            t++;
        }
        String str = "";
        for (int i=0; i<true_num.length; i++){
            str += true_num[i];
            str += " ";
        }
        return str;
    }
}