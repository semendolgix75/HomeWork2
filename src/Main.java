public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        //Необходимо присвоить переменным разные значения.
//        переменной dog значение 8.0;
//        переменной cat значение 3.6;
//        переменной paper значение 763789.
        var dog = 8.0;
        System.out.println("dog= "+dog);
        var cat = 3.6;
        System.out.println("cat= "+cat);
        var paper = 763789;
        System.out.println("paper= "+paper);

        System.out.println("Задача 2");
        //Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        dog=dog+4;
        System.out.println("dog+4= "+dog);
        cat = cat+4;
        System.out.println("cat+4= "+cat);
        paper = paper+4;
        System.out.println("paper+4= "+paper);

        System.out.println("Задача 3");
        //Теперь нужно уменьшить значение каждой переменной:
        //dog уменьшить на 3.5;
        //cat уменьшить на 1.6;
        //paper уменьшить на 7639.
        dog=dog-3.5;
        System.out.println("dog-3.5= "+dog);
        cat = cat-1.6;
        System.out.println("cat-1.6= "+cat);
        paper = paper-7639;
        System.out.println("paper-7639= "+paper);
      System.out.println("Задача 4");
//      Инициализируйте (присвойте значение) переменную friend значением 19.
//      Увеличьте значение переменной на 2, после чего поделите значение на 7.
//      После каждой операции выводите значение переменной в консоль.
//      В итоге у вас должно быть выведено 3 значения одной переменной.
        var friend=19;
        System.out.println("friend= "+friend);
        friend=friend+2;
        System.out.println("friend+2= "+friend);
        friend=friend/7;
        System.out.println("(friend+2)/7= "+friend);

        System.out.println("Задача 5");
//        Инициализируйте переменную frog значением 3.5.
//        Увеличьте переменную в 10 раз и поделите на 3.5.Добавьте к последнему значению переменной 4.
//        После каждой операции выводите значение переменной в консоль.
//        В итоге у вас должно быть выведено 4 значения одной переменной.
        var frog=3.5;
        System.out.println("frog= "+frog);
        frog=frog*10;
        System.out.println("frog*10= "+frog);
        frog=frog/3.5;
        System.out.println("frog*10/3.5= "+frog);
        frog=frog+4;
        System.out.println("frog*10/3.5+4= "+frog);

        System.out.println("Задача 6");
//        В боксе перед каждым боем спортсменов взвешивают.
//        Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории и бой будет честным.
//        Масса одного боксера — 78.2 кг.
//        Масса второго боксера — 82.7 кг.
//        Подсчитайте и выведите в консоль общую массу двух бойцов.
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var TotalWeight=boxerWeight1+boxerWeight2;
        System.out.println("Общая масса двух бойцов "+TotalWeight);

        System.out.println("Задача 7");
//        Найдите остаток от деления между двумя весами. Для решения этой задачи используйте тип переменной var.
        var remainderDivision=boxerWeight2%boxerWeight1;
        System.out.println("Веса боксеров различаются на = "+remainderDivision+" кг");

        System.out.println("Задача 8");
//      Решите задачу с помощью арифметических функций.
//      -640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
//      то сколько всего работников в компании?
//      Выведите результат задачи в консоль в формате: «Всего работников в компании — … человек».
//      -Посчитайте, сколько часов работы должно быть поделено между сотрудниками,
//      если в компании работает на 94 человека больше.
//      Выведите результат задачи в консоль в формате: «Если в компании работает … человек,
//      то всего … часов работы может быть поделено между сотрудниками».

        var totalTime=640;                      //640 часов работы поделено между сотрудниками
        var workTime=8;                         //Если каждый сотрудник посвящает работе 8 часов
        var numberPersonal=totalTime/workTime;  // сколько всего работников в компании
        System.out.println("Всего работников в компании - "+numberPersonal+" человек");
        numberPersonal=numberPersonal+94;
        totalTime=workTime*numberPersonal;
        System.out.println("Если в компании работает  "+numberPersonal+" человек, то всего "+totalTime+" часов работы может быть поделено между сотрудниками");
    }
}
