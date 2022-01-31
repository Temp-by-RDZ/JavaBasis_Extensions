package TRDZ.tasks;

import java.util.Scanner;

public class Initialization {

    private static final Scanner scanner = new Scanner(System.in);
    private static int Total;           //Количество животных
    protected static Animal[] Animals;  //Перечень животных

    public static void main(String[] args) {
    //region Ввод количества животных и их виды
        while (!(Total>0)) {
            System.out.println("Введите количество животных:");
            if (scanner.hasNextInt()) {Total = scanner.nextInt();} //Проверка на некоректный ввод
            else {System.out.println("Введено некоректное значение!");}
            scanner.nextLine();
            }
        Animals = new Animal[Total];
        for (int i=0; i<Total; i++) {
            System.out.println((i+1)+"ое животное это: 1-Собака 2-Кот или другое?");
            int tek = scanner.nextInt();
            if (tek==1) {Animals[i] = new Dog();}
            else if (tek==2) {Animals[i] = new Cat();}
            else {Animals[i] = new Animal();}
            }
    //endregion

    //region Отображение количества животных и определенных видов
        System.out.println("Количество животных: "+Animal.count);
        System.out.println("из которых котов: "+Cat.count);
        System.out.println("из которых собак: "+Dog.count);
    //endregion

    //region Выполнене команд
        System.out.println("\nВсе животные получили команду пробежать 200 метров...");
        for (Animal animal : Animals) {animal.run(200);}

        System.out.println("\nВсе животные получили команду пробежать 400 метров...");
        for (Animal animal : Animals) {animal.run(400);}

        System.out.println("\nВсе животные получили команду пробежать 600 метров...");
        for (Animal animal : Animals) {animal.run(600);}

        System.out.println("\nВсе животные получили команду проплыть 7 метров...");
        for (Animal animal : Animals) {animal.swim(7);}

        System.out.println("\nВсе животные получили команду проплыть 15 метров...");
        for (Animal animal : Animals) {animal.swim(15);}
    //endregion
        }
    }
