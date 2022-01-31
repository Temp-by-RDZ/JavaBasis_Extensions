package TRDZ.tasks;

public class Dog extends Animal {

    static int count; //Независимый счетчик

    {//def Initialize
        MyID = ++count;
        Name = "Пес";   //Это собака
        Limit = 500;    //Дистанция бега
        Swimit = 10;    //Дистанция плавания
        }

    }
