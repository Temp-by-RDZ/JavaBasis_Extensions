package TRDZ.tasks;

public class Cat extends Animal {

    static int count; //Независимый счетчик

    {//def Initialize
        MyID = ++count;
        Name = "Кот";   //Это кот
        Limit = 200;    //Дистанция бега
        }

    @Override
    protected void swim(int distance) { //Коты не любят плавать
        System.out.println(Name+" "+MyID+" не умеет плавать");
        }
    }
