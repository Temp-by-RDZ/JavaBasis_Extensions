package TRDZ.tasks;

public class Animal {
    static int count;
    protected String Name;
    protected int MyID;
    protected int Limit;
    protected int Swimit;

    {//def Initialize
        count++;
        Name = "Животное";      //Это некое животное
        //Limit = 0;            //Дистанция бега неизвестна поэтому не учитываяется для животных
        //Swimit = 0;           //Дистанция плавания неизвестна поэтому не учитываяется для животных
        }

    /**
     * Животное бежит на дистанцию
     * @param distance - дистанция
     */
    protected void run(int distance) {
        if (Limit!=0) {
            System.out.print(Name+" "+MyID+" ");
            if (distance>Limit) {System.out.println("попытался пробежать "+distance+" метров но выдохся");}
            else {System.out.println("пробежал "+distance+" метров");}
            }
        else {System.out.println(Name+" отправилось бежать "+distance+" метров...");}
        }

    /**
     * Животное плывет на дистанцию
     * @param distance - дистанция
     */
    protected void swim(int distance) {
        if (Swimit!=0) {
            System.out.print(Name+" "+MyID+" ");
            if (distance>Swimit) {System.out.println("попытался проплыть "+distance+" метров но выдохся");}
            else {System.out.println("проплыл "+distance+" метров");}
            }
        else {System.out.println(Name+" отправилось плыть "+distance+" метров...");}
        }
    }
